package mystring;

import java.io.UnsupportedEncodingException;

public class MyString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="welcome to beifeng你好";
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
		
		
		//替换
		System.out.println(str.replace('e', 'f'));//wflcomf to bfiffng,临时替代
		System.out.println(str.replaceAll("to", "tooo"));
		System.out.println(str);//welcome to beifeng
		
		
		
		//字符串转化成字符数组
		char arr[]=str.toCharArray();
		for (char c : arr) {
			System.out.println(c );
		}
		
		
		
		//split 分割
		String[] strings=str.split("e");
		for (String string3 : strings) {
			System.out.println(string3);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
