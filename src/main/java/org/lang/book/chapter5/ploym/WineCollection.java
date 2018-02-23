package org.lang.book.chapter5.ploym;

/**
 * 创建Wine的列表和数组集合元素。
 * 
 * @author chenjunfeng1
 *
 */
public class WineCollection {
    public Wine[] createWines() {
    	Wine[] wines = new Wine[3];
    	
    	wines[0] = new MTWine();
    	wines[1] = new MTWine();
    	wines[2] = new WLYWine();
    	
    	return wines;
    }
    
    public void invokeDrink(Wine wine) {
    	wine.drink();
    }
    
	public static void main(String[] args) {
		Wine mtWine = new MTWine();
		Wine wlyWine = new WLYWine();
		
		WineCollection wc = new WineCollection();
		wc.invokeDrink(mtWine);
		wc.invokeDrink(wlyWine);
	}
}
