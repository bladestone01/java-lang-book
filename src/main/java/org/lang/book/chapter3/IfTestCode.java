package org.lang.book.chapter3;
/**
 * 分支语句的测试用例代码.
 * 
 * @author tonychen
 *
 */
public class IfTestCode {

	public static void main(String[] args) {
		int productNum = 4;
		
		System.out.println("商品的折扣计算.....");
		double discount = 1;
		if (productNum == 1) {
			discount = 1;
		}
		else if (productNum == 2) {
			discount = 0.9;
		}
		else if (productNum == 3) {
			discount = 0.8;
		}
		else if (productNum == 4) {
			discount = 0.7;
		}
		else {
			discount = 0.7;
		}
        System.out.println("折扣率 Discount: " + discount);
		
	}

}
