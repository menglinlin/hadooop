package thread;

//�����̵߳����ַ�ʽ
/*1.�̳�Thread,��дrun����
 2.ʵ��Runable,
 3.�̵߳ļ���״̬��
 �½�״̬������״̬������״̬������״̬���߳�ִ��sleep��wait�ȷ���֮��ʧȥ��Դ��������״̬*/

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
				System.out.println(Thread.currentThread().getName() + "��ǰƱ��Ϊ��"
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
				System.out.println(Thread.currentThread().getName() + "��ǰƱ��Ϊ��"
						+ num--);
			}

		}

	}

}
