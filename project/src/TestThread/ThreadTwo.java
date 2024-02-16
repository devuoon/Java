package TestThread;

public class ThreadTwo extends Thread {
	@Override
	public void run() {
		System.out.println(getName()+" thread Start!");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(getName() + " thread Stop!");
	}
	
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			Thread t = new ThreadTwo();
			t.start();
			
			try {
				t.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
