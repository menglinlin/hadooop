package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
//Executor�̳߳�        cached���ٻ���洢���洢��  shutdown �ر�     executeִ��
//Fixed�̶����ȵ�     ScheduledԤ���� command����, initial Delay��ʼ�ӳ�, period����, unitʱ�䵥λ
public class ThreadPool {
	
	
	
	public static void main(String[] args) {
		/*ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
		for (int i = 0; i < 1000; i++) {
			Mythresd mythresd = new Mythresd();
//			mythresd.start();
			newCachedThreadPool.execute(mythresd);
		}
		newCachedThreadPool.shutdown();
		*/
		
		
		
		
	/*	ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(10);		
		for (int i = 0; i < 1000; i++) {
			Mythresd mythresd = new Mythresd();
			//mythresd.start();
			newFixedThreadPool.execute(mythresd);
		}
		newFixedThreadPool.shutdown();*/
		
	/*	ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
		for (int i = 0; i < 4; i++) {
			Mythresd mythresd = new Mythresd();
			//mythresd.start();
			newSingleThreadExecutor.execute(mythresd);
		}
		newSingleThreadExecutor.shutdown();*/
		
		
		
		
		
		ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(3);
		
		
		for (int i = 0; i < 3; i++) {
			Mythresd mythresd = new Mythresd();
			//mythresd.start();
		newScheduledThreadPool.scheduleAtFixedRate(mythresd, 1000, 2000, TimeUnit.MILLISECONDS);
		
		}
		
		System.out.println("���ܹر�");
	}
	
}
