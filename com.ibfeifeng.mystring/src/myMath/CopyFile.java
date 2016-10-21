package myMath;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFile {

	public static void main(String[] args) throws Exception {
		FileInputStream fileInputStream = new FileInputStream("e:/aa.txt");
		FileOutputStream fileOutputStream = new FileOutputStream("e:bb.txt");
		byte[] buffer = new byte[1024];
		int len = -1;
		while ((len = fileInputStream.read(buffer)) != -1) {
			fileOutputStream.write(buffer, 0, len);

		}
		fileOutputStream.flush();
		fileInputStream.close();
		fileOutputStream.close();

	}

}
