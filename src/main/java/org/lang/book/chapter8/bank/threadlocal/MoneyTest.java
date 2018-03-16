package org.lang.book.chapter8.bank.threadlocal;

import java.util.Random;

public class MoneyTest {
	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount();
		Saver saver = new Saver(bankAccount);
		Taker taker = new Taker(bankAccount);
		 
		Thread tSaver = new Thread(saver);
        Thread tTaker1 = new Thread(taker);
        Thread tTaker2 = new Thread(taker);
        
        //启动线程
        tTaker1.start();
        tSaver.start();
        tTaker2.start();
	}
	
	public static  class Taker implements Runnable {
		private BankAccount bankAccount;
		private Random rand = new Random();
		public Taker(BankAccount bankAccount) {
		    this.bankAccount = bankAccount;	
		}
		
		@Override
		public void run() {
			while (true) {
				bankAccount.subMoney(100);
				bankAccount.lookMoney();
				try {
					Thread.sleep(rand.nextInt(500));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static class Saver implements Runnable {
		private BankAccount bankAccount;
		private Random rand = new Random();
		public Saver(BankAccount bankAccount) {
			this.bankAccount = bankAccount;
		}
		
		@Override
		public void run() {
			while (true) {
				try {
					Thread.sleep(rand.nextInt(500));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				bankAccount.addMoney(100);
				bankAccount.lookMoney();
			}
		}
	}
}
