
import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        
        // create a hashmap to map integer ids(integer) -> names(strings)

        Map<Integer, String> studentMap = new HashMap<>();

        // add some key-value pairs
        studentMap.put(101, "Alice");
        studentMap.put(102, "Bob"); 
        studentMap.put(103, "Charlie");
        studentMap.put(101, "David"); // override

        // print the map

        System.out.println("Student Map: " + studentMap);

        // get a value by key

        System.out.println("Student with ID 102: " + studentMap.get(102));
        System.out.println("Student with ID 102: " + studentMap.size());

        // check if a key exists

        System.out.println("Contains key 102: " + studentMap.containsKey(102));
        System.out.println("Contains key");

        // removes the elements

        studentMap.remove(102);
        System.out.println("After removing 102: " + studentMap);
        System.out.println("New size: " + studentMap.size());

        // iterate all element

        System.out.println("Printing all the elements");
        for (Integer key : studentMap.keySet()) {
            System.out.println(key);

        }
    }
}
