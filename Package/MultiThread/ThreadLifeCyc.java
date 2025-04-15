package MultiThread;
class LifeCycleDemo extends Thread {
    public void run() {
        System.out.println(getName() + " is in RUNNING state");

        try {
            System.out.println(getName() + " is going to sleep (WAITING state)");
            Thread.sleep(7000); 
        } catch (InterruptedException e) {
            System.out.println(getName() + " was interrupted");
        }

        System.out.println(getName() + " is back to RUNNING state after sleep");
        System.out.println(getName() + " is now TERMINATED");
    }
}

public class ThreadLifeCyc{
    public static void main(String[] args) {
        LifeCycleDemo t1 = new LifeCycleDemo();

        System.out.println("Thread is in NEW state");
        t1.start(); 
}
}

