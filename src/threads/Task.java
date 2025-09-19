package threads;

public class Task extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.printf("Running in thread: %s (%d) %n", Thread.currentThread().getName(),i);
            try {
                Thread.sleep(2000); // Simulate work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
