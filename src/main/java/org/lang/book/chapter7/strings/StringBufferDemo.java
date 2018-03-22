package org.lang.book.chapter7.strings;

/**
 * StirngBuffer类的使用示例.
 * 
 * @author chenjunfeng1
 *
 */
public class StringBufferDemo {
	public static void main(String[] args) {
		String info = "Java Language Book";
		StringBuffer strbuf1 = new StringBuffer();
		StringBuffer strbuf2 = new StringBuffer(info);
		
		//Error,无法进行类型转换
		//StringBuffer info1 = (StringBuffer)info;
		
		//将StringBuffer转换为String
		String str2 = strbuf2.toString();
		
		//append()
		StringBuffer sb = new StringBuffer("abc");
        sb.append("def");
        System.out.println("变化后的字符串:" + sb.toString());

        //动态构建SQL语句
        StringBuffer sb1 = new StringBuffer();
        String user1 = "test";
        String pwd1 = "123";
        sb1.append("select * from userInfo where username=")
            .append(user1)
            .append(" and pwd=")
            .append(pwd1);

        //删除操作
        StringBuffer sb11 = new StringBuffer("Java");
        sb11.deleteCharAt(1);
        System.out.println("Java ,remove 1:" + sb11.toString());
        
        //delete删除区间
        StringBuffer sb12 = new StringBuffer("Java Book");
        sb12.delete (0,5);
        System.out.println("Java Book, delete from 1 to 5:" + sb12.toString());
        
        //insert
        StringBuffer sbi = new StringBuffer("Java Language Book");
        sbi.insert(5, "New " );
        System.out.println("Inserted String:" + sbi.toString());
        
        //reverse()方法
        StringBuffer rsb1 = new StringBuffer("Hello World");
        rsb1.reverse();
        System.out.println("reverse:" + rsb1.toString());
        
        //setCharAt替换特定位置的字符
        StringBuffer sbs1 = new StringBuffer("Java Book");
        sbs1.setCharAt(5,'L');
        System.out.println("setChartAt:" + sbs1.toString());
	}
}
