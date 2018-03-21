package org.lang.book.chapter7.objects;

/**
 * Object之Finalize()方法示例.
 * 
 * @author chenjunfeng1
 *
 */
public class FinalizeCase {
	public static void main(String[] args) throws Exception {
		Block holder = new Block();
		holder = null;
		System.gc();
	}

	static class Block {
		byte[] memZone = new byte[200 * 1024 * 1024];
		@Override
		protected void finalize() throws Throwable {
			System.out.println("invoke finalize Memory Allocation");
		}
	}
}