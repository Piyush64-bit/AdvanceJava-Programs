class Mythread extends Thread {
    public void run() {
        System.out.println("Thread is running.");
    }
}
public class Main {
    public static void main(String[] args) {
        Mythread t1 = new Mythread();
        t1.start();
    }
}