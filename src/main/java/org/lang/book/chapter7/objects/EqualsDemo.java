package org.lang.book.chapter7.objects;

public class EqualsDemo {
	// 名称
	private String name;
	// 尺寸大小
	private int size;

	public EqualsDemo() {

	}

	public EqualsDemo(String name, int size) {
		this.name = name;
		this.size = size;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		// 对象类型不同
		if (!(obj instanceof EqualsDemo)) {
			return false;
		}
		// 转换成当前类类型
		EqualsDemo newObj = (EqualsDemo) obj;
		/* 依次比较对象中每个变量: name/size属性 */ 
		if (!name.equals(newObj.name) || this.size != newObj.size ) {
			return false;
		}
		
		// 如果都相同，则返回 true
		return true;
	}

	public static void main(String[] args) {
		EqualsDemo demo1 = new EqualsDemo("name1", 12);
		EqualsDemo demo2 = new EqualsDemo("name2", 14);
		
		System.out.println("Equals: " + demo1.equals(demo2));
	}

}
