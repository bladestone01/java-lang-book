package org.lang.book.chapter5.ploym;

/**
 * 五粮液酒.
 * 
 * @author chenjunfeng1
 *
 */
public class WLYWine extends Wine {
	@Override
	public void drink() {
    	System.out.println("drink==>" + "五粮液");
    	taste();
    }
	@Override
	public void taste() {
    	System.out.println("taste==>" + "五粮液");
    }
}
