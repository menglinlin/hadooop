package mystring;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;
/*Properties��̳���Hashtable�ಢ��ʵ����Map�ӿڣ�Ҳ��ʹ��һ�ּ�ֵ�Ե���ʽ���������Լ���
����Properties������ĵط����������ļ���ֵ�����ַ������͡�

load(InputStream inStream)

����������Դ�.properties�����ļ���Ӧ���ļ��������У����������б�Properties�����

store(OutputStream out, String comments)
���������Properties�����������б��浽������С�

getProperty/setProperty
�����������Ƿֱ��ǻ�ȡ������������Ϣ

InputStream ins = this.getClass().getResourceAsStream("Path");

1��ʹ��java.util.Properties���load()����
ʾ���� InputStream in =new BufferedInputStream(new FileInputStream(name));
Properties p = new Properties();
p.load(in);

2��ʹ��java.util.ResourceBundle���getBundle()����
ʾ���� ResourceBundle rb = ResourceBundle.getBundle(name, Locale.getDefault());

3��ʹ��java.util.PropertyResourceBundle��Ĺ��캯��
ʾ���� InputStream in = new BufferedInputStream(new FileInputStream(name));
ResourceBundle rb = new PropertyResourceBundle(in);

4��ʹ��class������getResourceAsStream()����
ʾ���� InputStream in = JProperties.class.getResourceAsStream(name);
Properties p = new Properties();
p.load(in);

5��ʹ��class.getClassLoader()���õ���java.lang.ClassLoader��getResourceAsStream()����
ʾ���� InputStream in = JProperties.class.getClassLoader().getResourceAsStream(name);
Properties p = new Properties();
p.load(in);

6��ʹ��java.lang.ClassLoader���getSystemResourceAsStream()��̬����
ʾ���� InputStream in = ClassLoader.getSystemResourceAsStream(name);
Properties p = new Properties();
p.load(in);
*/
public class Mypro {

	public static void main(String[] args) throws IOException {
		/*File file = new File("src/jdbc.properties");
		FileInputStream  fis= new FileInputStream(file);*/
		
		InputStream fis = Mypro.class.getResourceAsStream("/jdbc.properties");
			
		Properties properties = new Properties();
		properties.load(fis);//storeһ���¼�ֵ��ʱ��Ҳ������ʹ��load()����
		String userNameString=properties.getProperty("userName");
		String passWordString=properties.getProperty("passWord");
		String urlString=properties.getProperty("url");
		String driverClassString=properties.getProperty("driverClass");
		System.out.println(userNameString);
		System.out.println(passWordString);
		System.out.println(urlString);
		System.out.println(driverClassString);
		
		properties.setProperty("name", "lianbing");
		FileOutputStream fileOutputStream = new FileOutputStream(new File("src/jdbc.properties"));	
		properties.store(fileOutputStream, "this is a comment");
		System.out.println("finish");
	}
	

}
