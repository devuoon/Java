package TestThread;

class MyClass {
    private int count;

    public void increment() {
        count++;
    }

    public void decrement() {
        count--;
    }

    public void getCount() {
        System.out.println("count = " + count);
    }
}

class ThreadImpl1 implements Runnable {
    private MyClass myClass;

    public ThreadImpl1(MyClass myClass) {
        this.myClass = myClass;
    }

    @Override
    public void run() {
        myClass.increment();
    }
}

class ThreadImpl2 implements Runnable {
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

        Thread thread1 = new Thread(new ThreadImpl1(myClass));
        Thread thread2 = new Thread(new ThreadImpl2(myClass));

        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();

        myClass.getCount();
    }
}

