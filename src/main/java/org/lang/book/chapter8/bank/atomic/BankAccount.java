package org.lang.book.chapter8.bank.atomic;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 定义银行类，模拟取钱和存钱的过程。
 * 
 * @author chenjunfeng1
 *
 */
public class BankAccount {
	private  AtomicInteger count = new AtomicInteger();// 账户余额

	// 存钱
	public void addMoney(int money) {
		count.getAndAdd(money);
		System.out.println(System.currentTimeMillis() + "存进：" + money);
	}

	// 取钱
	public void subMoney(int money) {
		if (count.get() - money < 0) {
			System.out.println("余额不足");
			return;
		}
		
		count.getAndAdd(money*-1);
		System.out.println(+System.currentTimeMillis() + "取出：" + money);
	}

	// 查询
	public void lookMoney() {
		System.out.println("账户余额：" + count);
	}
}
