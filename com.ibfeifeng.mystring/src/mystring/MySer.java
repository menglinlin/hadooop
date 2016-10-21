package mystring;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectOutputStream;

/*
ObjectOutputStream.writeObject()的作用是把一个实例的对象以文件的形式保存到磁盘上，这个过程就叫Java对象的持久化。

而这个文件是以二进制的形式编写的，当你用文本编辑器将它打开，这些二进制代码与某个字符集映射之后，显示出来的东西就成了乱码。

即使输出的是一个String的对象，也是以该String对象的二进制编码的形式输出，而不是输出String对象的内容。*/

public class MySer {

	
	public static void main(String[] args) throws Exception{
		//FileOutputStream是字节流
	/*	FileOutputStream fileOutputStream = new FileOutputStream("E:/aa.txt");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(new User("lianbign", "nan", "19"));
		objectOutputStream.flush();
		objectOutputStream.close();
		*/
		//FileOutputStream是字符流
		FileWriter fileWriter = new FileWriter("E:/bb.txt");
		fileWriter.append("dddddddddddddddddddddddddddddd");
		fileWriter.flush();
		fileWriter.close();
		System.out.println("finish");
		
	}

}
