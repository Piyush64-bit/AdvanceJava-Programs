import java.util.HashSet;
import java.util.Set;

public class CollectionsDemo {
    public static void main(String[] args) {
        
        // create a hashset to store integers (student ids)
        Set<Integer> studentIds = new HashSet<>();

        // add some student ids to the hashset  
        studentIds.add(101);
        studentIds.add(109);
        studentIds.add(111);
        studentIds.add(101); // duplicate will be ignored

        // print the set
        System.out.println("Student IDs: " + studentIds);

        // check the size
        System.out.println("Size: " + studentIds.size());

        // check if set contains a specific element
        System.out.println("Contains 102: " + studentIds.contains(102));
        System.out.println("Contains 105: " + studentIds.contains(105));

        // removing an element
        studentIds.remove(102);
        System.out.println("After removing 102: " + studentIds);
        System.out.println("New size: " + studentIds.size());


}