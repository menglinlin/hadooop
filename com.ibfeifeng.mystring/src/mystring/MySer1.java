package mystring;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class MySer1 {

	public static void main(String[] args) throws Exception{
		
		FileInputStream fileInputStream = new FileInputStream("E:/aa.txt");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		User user = (User)objectInputStream.readObject();
		System.out.println(user.getName());
		System.out.println(user.getSex());
		System.out.println(user.getAgeString());
		
		
		
		
		objectInputStream.close();
		
		
	}

}
