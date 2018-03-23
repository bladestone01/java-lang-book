package org.lang.book.chapter7.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 测试List的用法。
 * 
 * @author chenjunfeng1
 *
 */
public class ListTest {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Jackie");
		names.add("Kate");
		
		String[] name2 = new String[] {"Tommy", "Andy", "Alice", "Wendy"}; 
		names.addAll(Arrays.asList(name2));

		int index = names.indexOf("Tommy");
		System.out.println("Tommy is in index:" + index);
		
		//remove
		String name = names.remove(2);
		System.out.println("Remove Element:" + name);
		boolean isDeleted = names.remove("Alice");
		System.out.println("remove Alice:" + isDeleted);
		System.out.println("All elements:" + Arrays.toString(names.toArray()));
		
		String oldName = names.set(1, "Annie");
		System.out.println(oldName + " is set to be " + "Annie");
		name = names.get(1);
		System.out.println("Name in index 1:" + name);
		
		System.out.println("Current Size:" + names.size());
	}
}
