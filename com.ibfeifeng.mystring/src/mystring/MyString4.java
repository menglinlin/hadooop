package mystring;

import java.util.ArrayList;
import java.util.LinkedList;

public class MyString4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		final int NUM=100011;
		ArrayList<Integer> strArr = new ArrayList<Integer>();//��ѯ�� �� ��ɾ��
		LinkedList<Integer> strLink=new LinkedList<Integer>();//��ѯ�� ����ɾ��
		
		//����add����ʱ��
		Long start1=System.currentTimeMillis();
		for (int i = 0; i <NUM; i++) {
			strArr.add(i);
		}
		Long end1=System.currentTimeMillis();
		System.out.println("strArr���"+(end1-start1));
		
		
		
		Long start2=System.currentTimeMillis();
		for (int i = 0; i <NUM; i++) {
			strLink.add(i);
		}
		Long end2=System.currentTimeMillis();
		System.out.println("strLink���"+(end2-start2));

		
		
		
		Long start3=System.currentTimeMillis();
		for (int i = 0; i < strArr.size(); i++) {
			strArr.get(i);
		}
		Long end3=System.currentTimeMillis();
		System.out.println("strArr��ѯ"+(end3-start3));
		
		
		
		Long start4=System.currentTimeMillis();
		for (int i = 0; i <strLink.size(); i++) {
			strLink.get(i);
		}
		Long end4=System.currentTimeMillis();
		System.out.println("strArr��ѯ"+(end4-start4));
	}

}
