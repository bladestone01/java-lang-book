package org.lang.book.chapter3;

public class ForBreakTestCode {

	public static void main(String[] args) {
		// testBreak();
		// breakInnerLoop();

		breakMultipleLoop();
	}

	public static void testBreak() {

		for (int index = 0; index <= 10; index++) {
			if (index == 5)
				break; // index==5, break the loop
			System.out.println("The Current Index:" + index);
		}
	}

	public static void breakInnerLoop() {
		for (int outIndex = 0; outIndex < 10; outIndex++) {
			for (int innerIndex = 0; innerIndex < 5; innerIndex++) {
				if (innerIndex == 2) {
					System.out.println("中断当前循环,innerIndex" + innerIndex);
					break;
				}
				System.out.println("innerIndex:" + innerIndex);
			}
			System.out.println("outIndex:" + outIndex);
		}
	}

	public static void breakMultipleLoop() {
		// 无效的label示例
		MyLabel: {
			System.out.println("跳出了多重循环，继续执行后续代码。");
		}

		LoopLabel: for (int outIndex = 0; outIndex < 10; outIndex++) {
			for (int innerIndex = 0; innerIndex < 5; innerIndex++) {
				if (innerIndex == 2) {
					System.out.println("中断当前循环,innerIndex:" + innerIndex);
					break LoopLabel;
				}
				System.out.println("innerIndex:" + innerIndex);
			}
			System.out.println("outIndex:" + outIndex);
		}
	}

	public static void testLoopFlagBreak() {
		boolean breakFlag = false;  //初始化标识位
		for (int outIndex = 0; outIndex < 10; outIndex++) {
			for (int innerIndex = 0; innerIndex < 5; innerIndex++) {
				if (innerIndex == 2) {
					System.out.println("中断当前内层循环,innerIndex:" + innerIndex);
					breakFlag = true;
					break;
				}
				System.out.println("innerIndex:" + innerIndex);
			}
			
			if (breakFlag) break;  //中断outLoop外层循环
			System.out.println("outIndex:" + outIndex);
		}
	}
}
