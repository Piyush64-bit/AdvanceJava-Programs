// # MultiThreading
// # Thread, Sleep, Daemon, Pausing Execution

// Custom Thread class
class MessagePrinter extends Thread {
    private String message; // Thread message

    // Constructor
    public MessagePrinter(String message) {
        this.message = message;
    }

    // Method run() - mandatory override for Thread
    public void run() {
        // Loop to print message 3 times
        for (int i = 0; i < 3; i++) {
            System.out.println(message + " " + i);

            // Pausing execution using sleep()
            try {
                Thread.sleep(5000); // Sleep for 5 second
            } catch (InterruptedException e) {
                System.out.println("Thread execution interrupted");
            }
        }
    }
}

// Main class with main method
public class MessageTest {
    public static void main(String[] args) {
        // Creating and starting threads
        new MessagePrinter("Ping").start();
        new MessagePrinter("Pong").start();
    }
}
