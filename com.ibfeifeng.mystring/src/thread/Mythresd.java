package thread;

public class Mythresd extends Thread{

	@Override
	public void run() {
		System.out.println("当前线程名称\t"+Thread.currentThread().getName());
	}


	

}
