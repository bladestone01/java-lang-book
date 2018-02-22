package org.lang.book.chapter3;

public class DoWhileTestCode {

	public static void main(String[] args) {
		int index = 1; //初始条件
		int sumVal = 0; //存储最终结果
		
		do { 
			sumVal += index; //业务结算逻辑，这里时增加数字值
			System.out.println("现在计算的结果为：" + sumVal);
			index++; //循环条件在每次循环中变化，增加1
		} while (index <= 10);  // 循环判断条件
        System.out.println("最终的结果为:" + sumVal);
	}

}
