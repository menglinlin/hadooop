package myMath;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Nio {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fileInputStream = new FileInputStream("e:/aa.txt");
		FileOutputStream fileOutputStream = new FileOutputStream("e:bb.txt");
		//获取管道
		FileChannel channel = fileInputStream.getChannel();
		FileChannel channel2 = fileOutputStream.getChannel();
		//字节buffer定义大小allocate分配；指定
		ByteBuffer allocate = ByteBuffer.allocate(1024);
	
		while (channel.read(allocate) != -1) {
			allocate.flip();//相对buffer来讲，由写模式切换到读模式；
			channel2.write(allocate);//从缓冲区写出数据
			allocate.clear();//清除buffer缓存，切换到写模式；

		}
		//关闭流和管道
		fileInputStream.close();
		fileOutputStream.close();
		channel.close();
		channel2.close();

	}

}
