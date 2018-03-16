package org.lang.book.chapter8.bank.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 定义银行类，模拟取钱和存钱的过程。
 * 
 * @author chenjunfeng1
 *
 */
public class BankAccount {
	private int count = 0;// 账户余额
	private Lock lock = new ReentrantLock();

	// 存钱
	public void addMoney(int money) {
		lock.lock();
		count += money;
		System.out.println(System.currentTimeMillis() + "存进：" + money);
		lock.unlock();
	}

	// 取钱
	public void subMoney(int money) {
		lock.lock();
		if (count - money < 0) {
			System.out.println("余额不足");
			return;
		}
		count -= money;
		lock.unlock();
		
		System.out.println(+System.currentTimeMillis() + "取出：" + money);
	}

	// 查询
	public void lookMoney() {
		System.out.println("账户余额：" + count);
	}
}
