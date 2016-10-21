package test;
import java.io.FileInputStream;
//import java.io.FileOutputStream;
import java.net.URI;

import org.apache.hadoop.conf.Configuration;
//import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;
import org.junit.Before;
import org.junit.Test;

public class HadoopTest {
	FileSystem fs = null;
	@Before
	public void getFs() throws Exception{
		//1.��ȡһ��FileSystem����
			fs = FileSystem.get(
					new URI("hdfs://lianbingbing.com.cn:8020"),
					new Configuration(),
					"mll");
	}
	
	//��������
	/*@Test
	public void testDownload() throws Exception{
		//2.ͨ���ļ�ϵͳ�����ļ�
		FSDataInputStream in = fs.open(new Path("/wenjianjia/wenjian1/file"));
		//3.����һ�������
		FileOutputStream out = new FileOutputStream("D:/hadoopfile/hello");
		
		 * 4.copy�ļ�
		 * ʹ��true:����ʹ����֮���Զ��ر�
		 
		IOUtils.copyBytes(in, out, 4096, true);
	}*/
	
	//�����ϴ�
	@Test
	public void testUpload() throws Exception{
		FSDataOutputStream out = fs.create(new Path("/hello/log4j"), true);
		FileInputStream in = new FileInputStream("D://hello");
		IOUtils.copyBytes(in, out, 4096, true);
	}
	
	//���Դ����ļ���
/*	@Test
	public void testMkdir() throws Exception{
		boolean mkdirs = fs.mkdirs(new Path("/hello"));
		System.out.println(mkdirs);
	}*/
	
	//����ɾ��
/*	@Test
	public void testDel() throws Exception{
		boolean delete = fs.delete(new Path("/hello"), true);
		System.out.println(delete);
		
		
	}*/
}
