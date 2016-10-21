package thread;
//wait()会释放锁对象sleep()不会
public class Print implements Runnable {
	int start = 1;

	@Override
	public void run() {
		while (start <= 10) {

			synchronized (this) {
				notify();

				if (start++ % 2 == 0) {
					System.out
							.println(Thread.currentThread().getName() + "\t2");
				} else {
					System.out
							.println(Thread.currentThread().getName() + "\t1");
				}
				try {
					if (start == 11) {
						return;  
					}
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}

	}
}
