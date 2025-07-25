
import java.util.*;

public class OwnPriorityQueue {

    public static void main(String[] args) {

        // Intializing priorityOueue
        Queue <Integer> newdata = new PriorityQueue<>();

        // adding data
        newdata.offer(1);
        newdata.offer(2);
        newdata.offer(3);
        newdata.offer(4);
        newdata.offer(5);
        newdata.offer(6);
        newdata.offer(7);
        newdata.offer(8);
        newdata.offer(9);
        newdata.offer(10);

        // printing all
        System.out.println(newdata);

        // removing some elements
        System.out.println("Removing some elements");
        newdata.remove(3);
        newdata.remove(5);
        newdata.remove(7);

        while (!newdata.isEmpty()) {
            System.out.println(newdata.poll());
        }

    }
}
