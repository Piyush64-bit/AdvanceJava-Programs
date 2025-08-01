// Producer-Consumer Pattern Implementation using synchronized methods
// This demonstrates thread communication and synchronization concepts

import java.util.LinkedList;

/**
 * Buffer class acts as a shared resource between Producer and Consumer threads
 * Uses synchronized methods to ensure thread safety
 */
class Bufferrr {
    // Shared data structure - LinkedList acts as the buffer queue
    private LinkedList<Integer> queue = new LinkedList<>(); 
    // Maximum capacity of the buffer
    private int size = 5; 

    /**
     * Producer method - adds items to the buffer
     * synchronized keyword ensures only one thread can access this method at a time
     */
    public synchronized void produce(int value) throws InterruptedException {
        // Use while loop (not if) to avoid spurious wakeups
        while (queue.size() == size) { // Wait if queue is full
            wait(); // Release lock and wait for consumer to consume
        }
        queue.add(value); // Add item to buffer
        System.out.println("Produced: " + value);
        notify(); // Wake up waiting consumer thread
    }

    /**
     * Consumer method - removes items from the buffer
     * synchronized keyword ensures thread safety
     */
    public synchronized int consume() throws InterruptedException {
        // Use while loop to handle spurious wakeups properly
        while (queue.isEmpty()) { // Wait if queue is empty
            wait(); // Release lock and wait for producer to produce
        }
        int value = queue.removeFirst(); // Remove item from buffer
        System.out.println("Consumed: " + value);
        notify(); // Wake up waiting producer thread
        return value;
    }
}

/**
 * Main class demonstrating Producer-Consumer pattern
 * Shows how multiple threads can safely share resources using synchronization
 */
public class Bufferrrr {
    public static void main(String[] args) {
        // Create shared buffer object that both threads will use
        Bufferrr buffer = new Bufferrr();

        // Producer Thread - creates and adds items to buffer
        Thread producer = new Thread(() -> {
            try {
                // Produce 10 items (0 to 9)
                for (int i = 0; i < 10; i++) {
                    buffer.produce(i); // Add item to buffer
                    Thread.sleep(500); // Simulate production time (500ms)
                }
            } catch (InterruptedException e) {
                // Handle interruption during sleep or wait
                e.printStackTrace();
            }
        });

        // Consumer Thread - removes and processes items from buffer
        Thread consumer = new Thread(() -> {
            try {
                // Consume 10 items
                for (int i = 0; i < 10; i++) {
                    buffer.consume(); // Remove item from buffer
                    Thread.sleep(1000); // Simulate consumption time (1000ms - slower than producer)
                }
            } catch (InterruptedException e) {
                // Handle interruption during sleep or wait
                e.printStackTrace();
            }
        });

        // Start both threads - they will run concurrently
        // Producer will be faster (500ms) than Consumer (1000ms)
        // This will demonstrate buffer filling up and producer waiting
        producer.start();
        consumer.start();
        
        // Note: Main thread will exit immediately after starting both threads
        // The producer and consumer threads will continue running independently
    }
}