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
		//1.获取一个FileSystem对象
			fs = FileSystem.get(
					new URI("hdfs://lianbingbing.com.cn:8020"),
					new Configuration(),
					"mll");
	}
	
	//测试下载
	/*@Test
	public void testDownload() throws Exception{
		//2.通过文件系统下载文件
		FSDataInputStream in = fs.open(new Path("/wenjianjia/wenjian1/file"));
		//3.构造一个输出流
		FileOutputStream out = new FileOutputStream("D:/hadoopfile/hello");
		
		 * 4.copy文件
		 * 使用true:代表使用完之后自动关闭
		 
		IOUtils.copyBytes(in, out, 4096, true);
	}*/
	
	//测试上传
	@Test
	public void testUpload() throws Exception{
		FSDataOutputStream out = fs.create(new Path("/hello/log4j"), true);
		FileInputStream in = new FileInputStream("D://hello");
		IOUtils.copyBytes(in, out, 4096, true);
	}
	
	//测试创建文件夹
/*	@Test
	public void testMkdir() throws Exception{
		boolean mkdirs = fs.mkdirs(new Path("/hello"));
		System.out.println(mkdirs);
	}*/
	
	//测试删除
/*	@Test
	public void testDel() throws Exception{
		boolean delete = fs.delete(new Path("/hello"), true);
		System.out.println(delete);
		
		
	}*/
}
