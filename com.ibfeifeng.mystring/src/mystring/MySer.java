package mystring;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectOutputStream;

/*
ObjectOutputStream.writeObject()�������ǰ�һ��ʵ���Ķ������ļ�����ʽ���浽�����ϣ�������̾ͽ�Java����ĳ־û���

������ļ����Զ����Ƶ���ʽ��д�ģ��������ı��༭�������򿪣���Щ�����ƴ�����ĳ���ַ���ӳ��֮����ʾ�����Ķ����ͳ������롣

��ʹ�������һ��String�Ķ���Ҳ���Ը�String����Ķ����Ʊ������ʽ��������������String��������ݡ�*/

public class MySer {

	
	public static void main(String[] args) throws Exception{
		//FileOutputStream���ֽ���
	/*	FileOutputStream fileOutputStream = new FileOutputStream("E:/aa.txt");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(new User("lianbign", "nan", "19"));
		objectOutputStream.flush();
		objectOutputStream.close();
		*/
		//FileOutputStream���ַ���
		FileWriter fileWriter = new FileWriter("E:/bb.txt");
		fileWriter.append("dddddddddddddddddddddddddddddd");
		fileWriter.flush();
		fileWriter.close();
		System.out.println("finish");
		
	}

}
