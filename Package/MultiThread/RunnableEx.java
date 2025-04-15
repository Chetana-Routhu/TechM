package MultiThread;
class MyTask implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
        }
    }
}

public class RunnableEx {
    public static void main(String[] args) {
        MyTask task = new MyTask();

        Thread t1 = new Thread(task, "Thread-A");
        Thread t2 = new Thread(task, "Thread-B");

        t1.start(); 
        t2.start(); 
    }
}

