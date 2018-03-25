package org.lang.book.chapter7.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Set TestCase.
 * @author tonychen
 *
 */
public class SetTest {
	public static void main(String[] args) {
		Set<String> sets = new HashSet<String>();
		
		String[] names = {"Alice", "Miachel", "Annie"};
		sets.add("Jackie");
		sets.addAll(Arrays.asList(names));
		
		sets.add("Alice");
		System.out.println("Sets:" + Arrays.toString(sets.toArray()));
		
		Iterator<String> iters = sets.iterator();
		while(iters.hasNext()) {
			System.out.print(iters.next() + ",");
		}
		
		sets.remove("Alice");
		System.out.println("\nremoved Sets:" + Arrays.toString(sets.toArray()));
		
		//Sets 是否包含 names 列表
		boolean isContained = sets.retainAll(Arrays.asList(names));
		System.out.println("isContained:" + isContained);
		System.out.println("Sets:" + Arrays.toString(sets.toArray()));	
	}
}
