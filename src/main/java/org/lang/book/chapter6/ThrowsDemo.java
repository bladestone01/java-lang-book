package org.lang.book.chapter6;

import java.sql.SQLException;

/**
 * Throws/Throw Demo示例.
 * 
 * @author chenjunfeng1
 *
 */
public class ThrowsDemo {
    public void myMethod(String name, int num1) throws SQLException {
    	System.out.println("test exception");
    	//异常抛出点
    	throw new SQLException();
    }
}
