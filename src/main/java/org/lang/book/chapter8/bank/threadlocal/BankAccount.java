package org.lang.book.chapter8.bank.threadlocal;

/**
 * 定义银行类，模拟取钱和存钱的过程。
 * 
 * @author chenjunfeng1
 *
 */
public class BankAccount {
	// 账户余额
	private static ThreadLocal<Integer> counts = new ThreadLocal<Integer>(){
        @Override
        protected Integer initialValue(){
            return 100;
        }
    };
	// 存钱
	public void addMoney(int money) {
		counts.set(counts.get()+money);
		System.out.println(System.currentTimeMillis() + "存进：" + money);
	}

	// 取钱
	public void subMoney(int money) {
		if (counts.get() - money < 0) {
			System.out.println("余额不足");
			return;
		}
		counts.set(counts.get() - money);
		System.out.println(+System.currentTimeMillis() + "取出：" + money);
	}

	// 查询
	public void lookMoney() {
		System.out.println("账户余额：" + counts.get());
	}
}
