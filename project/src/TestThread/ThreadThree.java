package TestThread;

public class ThreadThree implements Runnable {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " Thread Start");	
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " Thread Stop");	
	}
	
	public static void main(String[] args) {
		for(int i = 0; i <10; i++) {
			Runnable task = new ThreadThree();
			Thread t = new Thread(task);
			t.start();
			
			try {
				t.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
