package TestThread;

/*
public class ThreadOne {
	public static void main(String[] args) {
		Thread tc = Thread.currentThread();
		System.out.println(tc.getName());
	}
}
*/

public class ThreadOne extends Thread{
	
	@Override
	public void run() {
		System.out.println("Thread run!!!");
	}

	public static void main(String[] args) {
		ThreadOne th = new ThreadOne();
		th.start();
	}
}
