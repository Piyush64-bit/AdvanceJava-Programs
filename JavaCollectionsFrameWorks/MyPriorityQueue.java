import java.util.*;

public class MyPriorityQueue {
    public static void main(String[] args) {
        
        // create a praiority queue to store exam scores

        Queue <Integer> examScores = new PriorityQueue<>();

        // adding elements
        examScores.offer(90);
        examScores.offer(85);
        examScores.offer(95);
        examScores.offer(80);

        // print the queue
        System.out.println("Exam Scores: " + examScores);

        // peek at the head 
        System.out.println("Head of the queue: " + examScores.peek());

        // remove and print elements in sorted order
        System.out.println("Removing elements in sorted order:");
        while (!examScores.isEmpty()) {
            System.out.println(examScores.poll());
        }

    }
}
