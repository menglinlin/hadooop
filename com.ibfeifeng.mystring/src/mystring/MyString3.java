package mystring;

import java.util.ArrayList;
import java.util.Arrays;

public class MyString3 {

	public static void main(String[] args) {
		
		final int NUM = 1000;
		StringBuffer stringBuffer = new StringBuffer("");
		for (int i = 0; i < NUM; i++) {
			if (i == NUM - 1) {
				stringBuffer.append(i);
			} else {
				stringBuffer.append(i + ",");
			}
		
		}

		
		String string=	stringBuffer.toString();


		
		Long start2=System.currentTimeMillis();
		String[] strings=getStringArr(string);
		System.out.println(Arrays.toString(strings));	
		Long end2=System.currentTimeMillis();
		System.out.println("自定义"+(end2-start2));


		Long start1=System.currentTimeMillis();
		String[] string1=string.split(",");
		System.out.println(Arrays.toString(string1));
		Long end1=System.currentTimeMillis();
		System.out.println("api提供"+(end1-start1));
		
	
	}



// 自定义方法分割字符串
	public static String[] getStringArr(String str) {

		ArrayList<String> strs = new ArrayList<String>();

		int len = -1;
		while ((len = str.indexOf(",")) != -1) {
			strs.add(str.substring(0, len));
			str = str.substring(len + 1);
			// 上下移动alt + 上下移动
		}
		strs.add(str);
		return strs.toArray(new String[strs.size()]);

	}
	
	
	


}
