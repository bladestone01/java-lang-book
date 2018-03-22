package org.lang.book.chapter7.strings;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		//字符串长度
		String str = new String("Java Language Book");
		int strlength = str.length();//strlength = 18	
		System.out.println("Java Language Book.length:" + strlength);
		
		//获取在字符串中的某个位置的字符
		String str1 = new String("Java Language Book");
		char ch = str1.charAt(5);//ch = L
        System.out.println("ch:" + ch);
        
        String str2 = new String("Java Language Book");
        String str3 = str1.substring(2);//str2 = "va Language Book"
        String str4 = str1.substring(5,9);//str3 = "Lang"
        System.out.println("str3:" + str3 + ", str4:" + str4);

        //字母串比较方法
        String str5 = new String("abc");
        String str6 = new String("ABC");
        int a = str5.compareTo(str6);//a>0
        System.out.println("compare result:" + a);
        int b = str6.compareToIgnoreCase(str5);//b=0
        System.out.println("compareIgnoreCase:" + b);
        boolean c = str5.equals(str2);//c=false
        boolean d = str6.equalsIgnoreCase(str2);//d=true
        System.out.println("equal:" + c + ", equalsIgnoreCase:" + d);
        
        //字符串连接方法
        String strcat = "aa".concat("bb").concat("cc");//相当于String str = "aa"+"bb"+"cc";
        System.out.println("string concat result:" +strcat);
        
        //String中的查找方法
        String strinfo = "I am a good student";
        int a1 = strinfo.indexOf('a');//a = 2
        int b1 = strinfo.indexOf("good");//b = 7
        int c1 = strinfo.indexOf("w",2);//c = -1
        int d1 = strinfo.lastIndexOf("a");//d = 5
        int e1 = strinfo.lastIndexOf("a",3);//e = 2

        //大小写转化
        String str11 = new String("asDF");
        String strlower= str11.toLowerCase();//str1 = "asdf"
        String strupper = str11.toUpperCase();//str2 = "ASDF"
        System.out.println("String Lower:" + strlower + ", String Upper:" + strupper);
        
        //字符串替换操作
        String strR = "asdzxcasd";
        String strR1= str.replace('a','g');//str1 = "gsdzxcgsd"
        String strR2 = str.replace("asd","fgh");//str2 = "fghzxcfgh"
        String strR3 = str.replaceFirst("asd","fgh");//str3 = "fghzxcasd"
        String strR4 = str.replaceAll("asd","fgh");//str4 = "fghzxcfgh"

        //trim()： 清除字符串前后的空格
        String strs1 = " a lot of word    ";
        String strs2 = strs1.trim();
        int a2 = strs1.length();//a = 18
        int b2 = strs2.length();//b = 13
        System.out.println("orginal str len:" + a2 +", trimed str len:" + b2);
        
        //前缀和后缀判断
        String strp1 = "Java Language Book";
        boolean ap1 = strp1.startsWith("Java");//ap1 = true
        boolean bp1 = strp1.endsWith("Book");//bp1 = true
        System.out.println(strp1 + " start with Java:" + ap1 + ", end with Book:" + bp1);
        
        //contains方法
        String strc1 = "student";
        boolean statusC1 = strc1.contains("stu");//true
        boolean statusC2 = strc1.contains("ok");//false
        System.out.println("student contain stu:" + statusC1 + ",contain ok:" + statusC2);
        
        //字符串分解方法
        String strt1 = "1+2-64*25+25/65";
        String[] strts = strt1.split("\\+|-|\\*|/"); //[1, 2, 64, 25, 25, 65]
        System.out.println("split string array length:" + strts.length);
        System.out.println("splited strings:" + Arrays.toString(strts));

        //将字符串转化为其它基本数据类型
        int n1 = Integer.parseInt("12");
        float f1 = Float.parseFloat("12.34");
        double dd = Double.parseDouble("1.124");

        //将基本类型转化为字符串
        String ss1 = String.valueOf(12);
        String ss2 = String.valueOf(12.34);

        //将Long按照2/8/16进制进行转换
        System.out.println("124转化为2进制:" + Long.toBinaryString(124l));
        System.out.println("124转化为8进制:" + Long.toOctalString(124l));
        System.out.println("124转化为16进制:" + Long.toHexString(124l));
        System.out.println("124转化为8进制:" + Long.toString(124l, 8));
	}
}
