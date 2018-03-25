package org.lang.book.chapter7.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest {
	private Map<String, String> map;

	public MapTest() {
		map = new HashMap<String, String>();
		this.map.put("day1", "math");
		this.map.put("day", "chemistry");
		this.map.put("day3", "history");
	}

	public void testIterator() {
		System.out.println(map.size()); // map映射个数

		// Map的遍历方式： Iterator
		Iterator<String> iterator = map.keySet().iterator();
		while (iterator.hasNext()) {
			Object key = iterator.next();
			System.out.println("Key=" + key + ", value=" + map.get(key));
		}
		System.out.println(map.entrySet().getClass()); // HashMap的内部类EntrySet

		// Map的EntrySet访问方式
		Set<Entry<String, String>> sets = map.entrySet();
		Set<String> setKeys = (Set<String>) map.keySet();
		Collection<String> values = map.values(); // 不能返回Set，values值可能有重复

		// 基于for循环遍历
		for (Map.Entry<String, String> entry : sets) {
			System.out.println("键：" + entry.getKey() + " 值：" + entry.getValue());
		}

		for (String key : setKeys) {
			System.out.println("键：" + key);
		}

		for (String value : values) {
			System.out.println("值：" + value);
		}
	}

	/**
	 * 判断Key/Value是否存在的方法。
	 * 
	 */
	public void testcase2() {
		boolean isDay1Key = this.map.containsKey("day1");
		System.out.println("Day1 exists:" + isDay1Key);
		boolean isMathValue = this.map.containsValue("math");
		System.out.println("Math class exists:" + isMathValue);
	}

	/**
	 * get/put/remove
	 */
	public void testcase3() {
		// get/put/remove 元素
		this.map.put("day4", "sport");
		System.out.println("day4:" + this.map.get("day4"));
		String removedKey = this.map.remove("day4");
		System.out.println("Removed Key:" + removedKey);
	}

	public static void main(String[] args) {
		MapTest t1 = new MapTest();
		t1.testIterator();
		t1.testcase2();
	}

}
