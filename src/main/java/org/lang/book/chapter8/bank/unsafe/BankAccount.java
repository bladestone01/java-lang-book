package org.lang.book.chapter8.bank.unsafe;

/**
 * 定义银行类，模拟取钱和存钱的过程。
 * @author chenjunfeng1
 *
 */
public class BankAccount {
	private int count = 0;// 账户余额

	// 存钱
	public void addMoney(int money) {
		count += money;
		System.out.println(System.currentTimeMillis() + "存进：" + money);
	}

	// 取钱
	public void subMoney(int money) {
		if (count - money < 0) {
			System.out.println("余额不足");
			return;
		}
		count -= money;
		System.out.println(+System.currentTimeMillis() + "取出：" + money);
	}

	// 查询
	public void lookMoney() {
		System.out.println("账户余额：" + count);
	}
}
