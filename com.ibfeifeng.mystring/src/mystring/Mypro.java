package mystring;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;
/*Properties类继承自Hashtable类并且实现了Map接口，也是使用一种键值对的形式来保存属性集。
不过Properties有特殊的地方，就是它的键和值都是字符串类型。

load(InputStream inStream)

这个方法可以从.properties属性文件对应的文件输入流中，加载属性列表到Properties类对象。

store(OutputStream out, String comments)
这个方法将Properties类对象的属性列表保存到输出流中。

getProperty/setProperty
这两个方法是分别是获取和设置属性信息

InputStream ins = this.getClass().getResourceAsStream("Path");

1。使用java.util.Properties类的load()方法
示例： InputStream in =new BufferedInputStream(new FileInputStream(name));
Properties p = new Properties();
p.load(in);

2。使用java.util.ResourceBundle类的getBundle()方法
示例： ResourceBundle rb = ResourceBundle.getBundle(name, Locale.getDefault());

3。使用java.util.PropertyResourceBundle类的构造函数
示例： InputStream in = new BufferedInputStream(new FileInputStream(name));
ResourceBundle rb = new PropertyResourceBundle(in);

4。使用class变量的getResourceAsStream()方法
示例： InputStream in = JProperties.class.getResourceAsStream(name);
Properties p = new Properties();
p.load(in);

5。使用class.getClassLoader()所得到的java.lang.ClassLoader的getResourceAsStream()方法
示例： InputStream in = JProperties.class.getClassLoader().getResourceAsStream(name);
Properties p = new Properties();
p.load(in);

6。使用java.lang.ClassLoader类的getSystemResourceAsStream()静态方法
示例： InputStream in = ClassLoader.getSystemResourceAsStream(name);
Properties p = new Properties();
p.load(in);
*/
public class Mypro {

	public static void main(String[] args) throws IOException {
		/*File file = new File("src/jdbc.properties");
		FileInputStream  fis= new FileInputStream(file);*/
		
		InputStream fis = Mypro.class.getResourceAsStream("/jdbc.properties");
			
		Properties properties = new Properties();
		properties.load(fis);//store一个新键值对时，也必须先使用load()方法
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
