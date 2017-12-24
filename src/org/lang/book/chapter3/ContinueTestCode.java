package org.lang.book.chapter3;

public class ContinueTestCode {

	public static void main(String[] args) {
		//testContinue();
	
		testContinueLabel();
	}
	
	public static void testContinue() {
		for (int index=0; index<5; index++) {
			if (index ==3) continue;
			
			System.out.println("现在的循环变量：" + index);
		}
	}
	
	public static void testContinueLabel() {
		LoopLabel:
			for (int outIndex = 0; outIndex<2; outIndex++) {
				for (int index=0; index<5; index++) {
					if (index ==3) continue LoopLabel;
					
					System.out.println("现在的循环变量,outIndex:" + outIndex + ", innerIndex：" + index);
				}
				System.out.println("外层循环变量：" + outIndex);
			}
	}
}
