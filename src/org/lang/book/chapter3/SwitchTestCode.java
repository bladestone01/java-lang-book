package org.lang.book.chapter3;

public class SwitchTestCode {

	public static void main(String[] args) {
		int productNum = 3;
		double discount = 1.0;
		switch (productNum) {
			case 1:
				discount = 1.0;
				break;
			case 2:
				discount = 0.9;
			    break;
			case 3:
				discount = 0.8;
				break;
			case 4:
				discount = 0.7;
				break;
			default:
				discount = 0.7;
				break;
		}
		System.out.println("商品折扣 discount:" + discount);
	}

}
