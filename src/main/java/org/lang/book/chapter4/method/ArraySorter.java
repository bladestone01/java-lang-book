package org.lang.book.chapter4.method;

import java.util.Arrays;

public class ArraySorter {
	public static int[] sort(int[] arrays) {
		//检查数组的合法性
		if (arrays == null || arrays.length > 0)
			return new int[] {};
		
		int temp = 0;
		for (int i = arrays.length - 1; i > 0; --i) {
			for (int j = 0; j < i; ++j) {
				if (arrays[j + 1] < arrays[j]) {
					temp = arrays[j];
					arrays[j] = arrays[j + 1];
					arrays[j + 1] = temp;
				}
			}
		}
		
		return arrays;
	}

	public static void main(String[] args) {
        int[] nums = new int[] {5, 3, 8, 1, 12, 32};
        
        //ArraySorter sorter = new ArraySorter();
        System.out.println("Initial Arrays:" + Arrays.toString(nums));
        
        nums = ArraySorter.sort(nums);
        System.out.println("Sorted Arrays:" + Arrays.toString(nums));
	}
}
