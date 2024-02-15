package TestThread;

public class ThreadOne {
	public static void main(String[] args) {
		Thread tc = Thread.currentThread();
		System.out.println(tc.getName());
	}
}
