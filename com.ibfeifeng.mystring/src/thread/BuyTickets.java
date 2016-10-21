package thread;

//创建线程的两种方式
/*1.继承Thread,重写run方法
 2.实现Runable,
 3.线程的集中状态：
 新建状态，就绪状态，运行状态，阻塞状态（线程执行sleep、wait等方法之后失去资源），死亡状态*/

public class BuyTickets implements Runnable {
	int num = 1010;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (num > 0) {
			synchronized (this) {
				if (num < 1) {
					return;
				}
				System.out.println(Thread.currentThread().getName() + "当前票号为："
						+ num--);
			}

		}

	}

}

class BuyTickets2 extends Thread {
	static int num = 100;

	public void run() {
	
		while (num > 0) {
			synchronized (this) {
				if (num < 1) {
					return;
				}
				System.out.println(Thread.currentThread().getName() + "当前票号为："
						+ num--);
			}

		}

	}

}
