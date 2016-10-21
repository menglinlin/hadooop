package oop;

public class TestStatic {
	 static String name="china";
	   
	    {
	       System.out.println("========方法体========");
	    }
	   
	    static{
	       name="England";
	       System.out.println("========静态程序块======");
	    }
	   
	    TestStatic(){
	       System.out.println("=========构造方法========");
	    }
	   
	    public static void main(String[] args){
	       System.out.println("========主方法========"+name);
	    }
	   
	    public void test(){
	       System.out.println("========测试方法=========");
	    }
	}
	 
//	子类：
	 class TestExtendStatic extends TestStatic{
	 
	    //public static String name="HUBEI";
	   
	    {
	       System.out.println("========无名称方法体========");
	    }
	   
	    static{
	       //name="SUIZHOU";
	       System.out.println("========子类静态程序块======");
	    }
	   
	    TestExtendStatic(){
	       System.out.println("=========子类构造方法========");
	    }
	   
	    public void test(){
	       System.out.println("========子类测试方法=========");
	    }
	   
	    public static void main(String[] args){
	       System.out.println("========子类主方法========"+name);
	       TestStatic ts = new TestExtendStatic();// 上转型对象
	       ts.test(); 
	    }
}
