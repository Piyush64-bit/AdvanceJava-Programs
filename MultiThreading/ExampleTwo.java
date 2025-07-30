class cookingTask extends Thread {
    private String task;

    public cookingTask(String task) {
        this.task = task;
    }
    public void run() {
        System.out.println(task + " is being prepared by" + Thread.currentThread().getName());
    }
}

public class ExampleTwo {
    public static void main(String[] args) {
        Thread t1 = new cookingTask("pasta");
        Thread t2 = new cookingTask("pizza");
        Thread t3 = new cookingTask("burger");
        Thread t4 = new cookingTask("sandwich");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
