package org.lang.book.chapter3.example;

/**
 * 计算Beer啤酒的数量.
 * 
 * @author tonychen
 *
 */
public class CalcBeer {
	public static void main(String[] args) {
		case1();
		case2();
	}

	public static void case1() {
		int num = 100; // 啤酒数量
		int drinkNum = 0; // 喝掉的啤酒数量
		int emptyNum = 0; // 空瓶子的数量

		while (num > 0) {// 有啤酒可以喝
			num--;
			emptyNum++; // 空瓶子数量增加 1
			drinkNum++; // 喝掉的啤酒数量增加 1
			if (emptyNum == 3) { // 有 3 个空瓶子，则去换
				num++; // 啤酒数量增加 1
				emptyNum = 0; // 空瓶子数量清零
			}
		}

		System.out.println("总共喝掉瓶数:" + drinkNum);
		System.out.println("剩余空瓶子数:" + emptyNum);
	}

	public static void case2() {
		int num = 100; // 汽水数量
		int drinkNum = 0; // 喝掉的汽水数量
		int emptyNum = 0; // 空瓶子的数量
		while (num > 0) { // 有汽水可以喝
			drinkNum += num; // 喝掉所有的汽水
			emptyNum += num; // 空瓶子数量等于上次剩余的加上这次喝掉的数量
			num = emptyNum / 3; // 兑换的汽水数量
			emptyNum -= num * 3; // 本次兑换剩余的空瓶子数量
		}
		System.out.println("总共喝掉瓶数:" + drinkNum);
		System.out.println("剩余空瓶子数:" + emptyNum);
	}
}
