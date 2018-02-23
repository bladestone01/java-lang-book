package org.lang.book.chapter5.ploym;

/**
 * 茅台酒.
 * 
 * @author chenjunfeng1
 *
 */
public class MTWine extends Wine {
	@Override
	public void drink() {
    	System.out.println("drink==>" + "茅台");
    	taste();
    }
	@Override
	public void taste() {
    	System.out.println("taste==>" + "茅台");
    }
}
