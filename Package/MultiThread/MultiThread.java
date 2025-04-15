package MultiThread;
class MyThread extends Thread {
    public boolean flag;

	public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " is running: " + i);
        }
    }
}

public class MultiThread {
    public static void main(String[] args) {
        MyThread2 t1 = new MyThread2();
        MyThread2 t2 = new MyThread2();

        t1.start(); 
        t2.start(); 
}

}