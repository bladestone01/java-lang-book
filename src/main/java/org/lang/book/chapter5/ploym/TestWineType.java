package org.lang.book.chapter5.ploym;

/**
 * 基于instanceof检测Wine的实际类型。
 * 
 * @author chenjunfeng1
 *
 */
public class TestWineType {
	public static void main(String[] args) {
		 Wine wine1 = new MTWine();
		 Wine wine2 = new WLYWine();
		 
		 boolean isMT = wine1 instanceof MTWine;
		 boolean isWLY = wine2 instanceof WLYWine;
         System.out.println("MT object:" + isMT);
         System.out.println("WLY object:" + isWLY);
	}
}
