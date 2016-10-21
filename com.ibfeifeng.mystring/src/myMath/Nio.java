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
		//��ȡ�ܵ�
		FileChannel channel = fileInputStream.getChannel();
		FileChannel channel2 = fileOutputStream.getChannel();
		//�ֽ�buffer�����Сallocate���䣻ָ��
		ByteBuffer allocate = ByteBuffer.allocate(1024);
	
		while (channel.read(allocate) != -1) {
			allocate.flip();//���buffer��������дģʽ�л�����ģʽ��
			channel2.write(allocate);//�ӻ�����д������
			allocate.clear();//���buffer���棬�л���дģʽ��

		}
		//�ر����͹ܵ�
		fileInputStream.close();
		fileOutputStream.close();
		channel.close();
		channel2.close();

	}

}
