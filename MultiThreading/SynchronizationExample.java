// * Synchronization Example
// "Shared counter with / without synchronization"
// Demonstrates race condition when threads access shared resource

class Counter {
    int count = 0;

    // Uncomment this to make it thread-safe
    // synchronized void increment() {
    void increment() {
        count++;
    }
}

public class SynchronizationExample {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        // Thread 1: increments counter 10000 times
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter.increment();
            }
        });

        // Thread 2: does the same
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter.increment();
            }
        });

        t1.start(); // Start thread 1
        t2.start(); // Start thread 2

        // Wait for both threads to finish
        t1.join();
        t2.join();

        // Final output (may vary without synchronization)
        System.out.println("Count: " + counter.count);
    }
}
