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
		System.out.println("�Զ���"+(end2-start2));


		Long start1=System.currentTimeMillis();
		String[] string1=string.split(",");
		System.out.println(Arrays.toString(string1));
		Long end1=System.currentTimeMillis();
		System.out.println("api�ṩ"+(end1-start1));
		
	
	}



// �Զ��巽���ָ��ַ���
	public static String[] getStringArr(String str) {

		ArrayList<String> strs = new ArrayList<String>();

		int len = -1;
		while ((len = str.indexOf(",")) != -1) {
			strs.add(str.substring(0, len));
			str = str.substring(len + 1);
			// �����ƶ�alt + �����ƶ�
		}
		strs.add(str);
		return strs.toArray(new String[strs.size()]);

	}
	
	
	


}
