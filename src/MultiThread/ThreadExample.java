package MultiThread;

public class ThreadExample extends Thread {
    public void run() {
        System.out.println("Thread is running: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadExample thread1 = new ThreadExample();
        ThreadExample thread2 = new ThreadExample();
        thread1.start();
        thread2.start();
    }
}
