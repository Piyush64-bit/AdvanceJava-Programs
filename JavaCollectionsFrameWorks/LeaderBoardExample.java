// chaining collections for the data grouping
// -> Tree map with primiary queue

import java.util.*;

public class LeaderBoardExample {

    public static void main(String[] args) {
        TreeMap<Integer, PriorityQueue<String>> leaderBoard = new TreeMap<>();

        // Populate the data
        leaderBoard.putIfAbsent(100, new PriorityQueue<>());
        leaderBoard.get(100).add("Alice");
        leaderBoard.get(100).add("Bob");

        leaderBoard.putIfAbsent(90, new PriorityQueue<>());
        leaderBoard.get(90).add("Charlie");

        // Display in order
        for(Map.Entry<Integer, PriorityQueue<String>> entry : leaderBoard.entrySet()) {
            System.out.println("Score: " + entry.getKey() + ", Players: " + entry.getValue());

        }
    }
}

// Step - 1
// -> TreeMap: Stores keys in sorted order.
// -> PriorityOueue: Holds players name for each score.

// Step - 2
// -> TreeMap(</.......................>)
// -> Intialize a treemap with integer keys(the scores,) using collections.reverse order()
// -> Higher scores comes first

// Step - 3
// -> Populating the LeaderBoard
// -> putIfAbsent => checks if 100 is present in the map, if not add a new priorityqueue<>(); for the same.
// -> add alice, bob => for the score 100.
// -> both are now associated with same score.

// Step - 4
// -> Display the leaderboard 
// -> for(......)
// -> Itrates through the map entries in decending order of source(due to collection.reverse order)
// -> prints each score alongside list of playernames

// *treemap orders scores
// *priority queue stores players
// *efficient grouping->multiple played with same score are grouped together under save scores without duplicating the code.
