package oop;

public class TestStatic {
	 static String name="china";
	   
	    {
	       System.out.println("========������========");
	    }
	   
	    static{
	       name="England";
	       System.out.println("========��̬�����======");
	    }
	   
	    TestStatic(){
	       System.out.println("=========���췽��========");
	    }
	   
	    public static void main(String[] args){
	       System.out.println("========������========"+name);
	    }
	   
	    public void test(){
	       System.out.println("========���Է���=========");
	    }
	}
	 
//	���ࣺ
	 class TestExtendStatic extends TestStatic{
	 
	    //public static String name="HUBEI";
	   
	    {
	       System.out.println("========�����Ʒ�����========");
	    }
	   
	    static{
	       //name="SUIZHOU";
	       System.out.println("========���ྲ̬�����======");
	    }
	   
	    TestExtendStatic(){
	       System.out.println("=========���๹�췽��========");
	    }
	   
	    public void test(){
	       System.out.println("========������Է���=========");
	    }
	   
	    public static void main(String[] args){
	       System.out.println("========����������========"+name);
	       TestStatic ts = new TestExtendStatic();// ��ת�Ͷ���
	       ts.test(); 
	    }
}
