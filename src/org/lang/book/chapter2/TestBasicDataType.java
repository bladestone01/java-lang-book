package org.lang.book.chapter2;

/**
 * չʾ�����������͵�ʹ�á�
 * 
 * @author chenjunfeng1
 *
 */
public class TestBasicDataType {
	public static void main(String[] args) {
		int intNum = 16; // ����
		int intNum08 = 020; // 8���ƣ�
		int intNum16 = 0x10; // 16���ƣ�16
		int intNum02 = 0b10000; // 2���ƣ�4

		//չʾint�������ݵ����
		System.out.println("16��10���Ƶ�ֵΪ:" + intNum);
		System.out.println("16��8���Ƶ�ֵΪ:" + intNum08);
		System.out.println("16��16���Ƶ�ֵΪ:" + intNum16);
		System.out.println("16��2���Ƶ�ֵΪ:" + intNum02);
		System.out.println("intռ�õ��ֽ���:" + Integer.SIZE / 8);

		
		short shortNum = 123;  //short���͵���ֵ��123
		//չʾshort�������ݵ����
		System.out.println("short���ݵ�ֵΪ:" + shortNum);
		System.out.println("Shortռ�õ��ֽ���Ϊ:" + Short.SIZE/8);
		
		long longNum = 123l;   //�����͵�����123,ʹ�ú�׺l
		long longNum2 = 123;   //�����͵�����123
		//չʾʹ��long����������
		System.out.println("long���ݵ�ֵ:" + longNum);
		System.out.println("long���ݵ�ֵ2:" + longNum2);
		System.out.println("longռ�õ��ֽ���:" + Long.SIZE/8);

		byte byteNum = 115;  //����byte����ֵ
		//byte byteOverNum = 137; //�����������ͷ�Χ����������ʾ����
		System.out.println("byte���ݵ�����:" + byteNum);
		System.out.println("byteռ�õ��ֽ���:" + Byte.SIZE/8);
		

		float floatNum = 1.234f;  //�����ȸ���������ֵ
		//����Ϊ������������δʹ�ú�׺f,����������
		//������Ϣ: Type mismatch: cannot convert from double to float
	    //float floatNum1 = 1.234; 
		System.out.println("float����ֵΪ:" + floatNum);
		System.out.println("floatռ�õ��ֽ���:" + Float.SIZE/8);
		
		
		double doubleNum = 123.3332;  //˫���ȸ���������ֵ
		System.out.println("double����ֵΪ:" + doubleNum);
		System.out.println("doubleռ�ݵ��ֽ���:" + Double.SIZE/8);

		char charVariable = 'a';  //�����ַ�����
		char charVariable2 = 97;  //ʹ���ַ���λ�����������ַ�
		System.out.println("char���ַ�ֵΪ:" + charVariable);
		System.out.println("char��λ��������չʾλ:" + charVariable2);
		System.out.println("charռ�ݵ��ֽ���Ϊ:" + Character.SIZE/8);
		
		boolean isValid = true;  //������trueֵ
		boolean isWorking = false; //������falseֵ
		System.out.println("boolean��trueֵ:" + isValid);
		System.out.println("boolean��falseֵ:" + isWorking);
	}

}
