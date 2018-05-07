package org.lang.book.chapter3.example;

/**
 * 百元买东西的示例。
 * 
 * @author tonychen
 *
 */
public class BuyThing100 {

	public static void main(String[] args) {
		planA();
		//planB();
	}

	public static void planA() {
		int planCount = 0;  //方案数量
		for (int i=1; i<100; i++) {
			for (int j=1; j<100; j++) {
				for (int k=1; k<100; k++) {
					if (5*i + 8*j + 3*k<=100) { //金额在100元范围之内。
						planCount++; //方案数量自增
						System.out.println("Plan:" + planCount + ", 可乐:" + i + ", 牛奶:" + j + ",汽水:" + k);
					}
				}
			}
		}
	}
	
	public static void planB() {
		int planCount = 0;  //方案数量
		for (int i=1; i<=100/5; i++) {
			for (int j=1; j<=100/8; j++) {
				for (int k=1; k<=100/3; k++) {
					if (5*i + 8*j + 3*k<=100) { //金额在100元范围之内。
						planCount++; //方案数量自增
						System.out.println("Plan:" + planCount + ", 可乐:" + i + ", 牛奶:" + j + ",汽水:" + k);
					}
				}
			}
		}
	}
}
