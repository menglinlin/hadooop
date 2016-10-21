package mystring;

public class MyString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int NUM=1000;
		String string="hello";
		StringBuilder sBuilder=new StringBuilder("hello1");
		StringBuffer stringBuffer=new StringBuffer("hello");
		
		
		
		//String
		Long  start1=	System.currentTimeMillis();
		for (int i = 0; i <  NUM; i++) {
			string=string+i;
//		System.out.println(string );
		}
		Long  end1=	System.currentTimeMillis();
		System.out.println("11111111111166666666666\t\t\t\t"+(end1-start1));
		
		
		
		
		
		//StringBuder线程不安全的
		Long  start2=	System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			sBuilder.append(i);
//		System.out.println(sBuilder );
		}
		Long  end2=	System.currentTimeMillis();

		
		System.out.println("2222222222222222225555555555555\t\t\t\t"+(end2-start2));
		
		
		//StringBuffer线程安全的
		Long  start3=	System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			stringBuffer.append(i);
		}
		Long  end3=	System.currentTimeMillis();
		System.out.println("333333333337777777777777\t\t\t\t"+(end3-start3));
	}
	

}
