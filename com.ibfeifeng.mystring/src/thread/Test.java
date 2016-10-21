package thread;

public class Test {

	public static void main(String[] args) {
		/*
		 * BuyTickets2 buyTickets = new BuyTickets2(); Thread thread = new
		 * Thread(buyTickets); Thread thread1 = new Thread(buyTickets); Thread
		 * thread2 = new Thread(buyTickets); thread.start(); thread1.start();
		 * thread2.start();
		 */

		/*
		 * BuyTickets2 buyTickets = new BuyTickets2(); BuyTickets2 buyTickets2 =
		 * new BuyTickets2(); BuyTickets2 buyTickets3 = new BuyTickets2();
		 * buyTickets.start(); buyTickets2.start(); buyTickets3.start();
		 */

		Print print = new Print();
		Thread thread = new Thread(print,"线程A");
		Thread thread1 = new Thread(print,"线程B");
		
		thread.start();
		thread1.start();
	

	}

}
