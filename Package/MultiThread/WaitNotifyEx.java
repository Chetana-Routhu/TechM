package MultiThread;

class SharedResource {
    private boolean ready = false;

    public synchronized void waitForSignal() {
        System.out.println("Waiting for signal...");

        while (!ready) {
            try {
                wait(); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Received signal! Continuing work...");
    }

    public synchronized void sendSignal() {
        ready = true;
        System.out.println("Sending signal...");
        notify(); 
    }
}

public class WaitNotifyEx {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        
        Thread t1 = new Thread(() -> {
            resource.waitForSignal();
        });

        
        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(2000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            resource.sendSignal();
        });

        t1.start();
        t2.start();
    }
}

