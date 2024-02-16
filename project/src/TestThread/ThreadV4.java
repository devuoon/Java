package TestThread;

//클래스 정의
class MyClass {
	private int count; 			// count변수 선언

	public void increment() { // 증가 메서드
		count++;
	}

	public void decrement() { // 감소 메서드
		count--;
	}

	public void getCount() { // 현재 count값을 출력하는 메서드
		System.out.println("count = " + count);
	}
}

// 클래스 정의
class ThreadImpl1 implements Runnable { // Runnable 인터페이스 구현
	private MyClass myClass; // 생성자를 통해 MyClass 객체를 받아옴

	public ThreadImpl1(MyClass myClass) {
		this.myClass = myClass;
	}

	@Override
	public void run() { // MyClass 객체의 증가 메서드 호출하여 count 증가
		myClass.increment();
	}
}

class ThreadImpl2 implements Runnable { // Runnable 인터페이스 구현
	private MyClass myClass;

	public ThreadImpl2(MyClass myClass) {
		this.myClass = myClass;
	}

	@Override
	public void run() {
		myClass.decrement();
	}
}

public class ThreadV4 {
	public static void main(String[] args) throws InterruptedException {
		MyClass myClass = new MyClass();

		// 만번 더하는 스레드
		Thread threadIncrement = new Thread(() -> {
			for (int i = 0; i < 10000; i++) {
				myClass.increment();
			}
		});

		// 만번 빼는 스레드
		Thread threadDecrement = new Thread(() -> {
			for (int i = 0; i < 10000; i++) {
				myClass.decrement();
			}
		});

		// 두 스레드 실행
		threadIncrement.start();
		threadIncrement.join(); // 첫 번째 스레드가 실행 완료될 때까지 대기

		myClass.getCount();

		// 다시 만번 빼는 스레드 실행
		threadDecrement.start();
		threadDecrement.join(); // 두 번째 스레드가 실행 완료될 때까지 대기

		// 최종 count 출력
		myClass.getCount();
	}
}
