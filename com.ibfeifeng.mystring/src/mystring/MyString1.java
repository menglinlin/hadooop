package mystring;

import java.io.UnsupportedEncodingException;

public class MyString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="welcome to beifeng���";
		int index = str.indexOf('e');
		System.out.println(index);
		int lastIndex = str.lastIndexOf('e');
		System.out.println(lastIndex);
		System.out.println(str.substring(5));
		System.out.println(str.substring(5,10));
		String string;
		try {
			string = new String(str.getBytes("iso-8851-1"));
			System.out.println(string);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//�滻
		System.out.println(str.replace('e', 'f'));//wflcomf to bfiffng,��ʱ���
		System.out.println(str.replaceAll("to", "tooo"));
		System.out.println(str);//welcome to beifeng
		
		
		
		//�ַ���ת�����ַ�����
		char arr[]=str.toCharArray();
		for (char c : arr) {
			System.out.println(c );
		}
		
		
		
		//split �ָ�
		String[] strings=str.split("e");
		for (String string3 : strings) {
			System.out.println(string3);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
