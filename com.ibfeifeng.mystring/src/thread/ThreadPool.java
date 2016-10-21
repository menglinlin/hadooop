package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
//Executor线程池        cached高速缓冲存储器存储的  shutdown 关闭     execute执行
//Fixed固定长度的     Scheduled预定的 command命令, initial Delay初始延迟, period周期, unit时间单位
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
		
		System.out.println("不能关闭");
	}
	
}
