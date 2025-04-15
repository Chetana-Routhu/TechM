package MultiThread;
class MyThread2 extends Thread {
    volatile boolean flag = true;

    public void run() {
        System.out.println("Thread is running...");
        while (flag) {
            
        }
        System.out.println("Thread has stopped.");
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();
        t.start();
        Thread.sleep(2000); 
        t.flag = false;     
        System.out.println("Main thread changed flag to false.");
    }
}


