package org.lang.book.chapter4;

public class StaticMethodDemo {

	/**
	 * 从数组中找出最大的元素。
	 * 
	 * @param numbers
	 * @return
	 */
	public static int max(int[] numbers) {
	    int maxNum = Integer.MIN_VALUE;
	    
	    for (int number : numbers) {
	    	if (number > maxNum) 
	    		maxNum = number;
	    }
	    
	    return maxNum;
	}
	
	public static void main(String[] args) {
		int[] numbers = new int[]{-1, 4, 32, 9, 2};

		int maxiumNum = StaticMethodDemo.max(numbers);
		System.out.println("Max Number:" + maxiumNum);
	}

}
