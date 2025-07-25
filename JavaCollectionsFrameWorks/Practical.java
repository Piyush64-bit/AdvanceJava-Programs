import java.util.*;


public class Practical {
    public static void main(String[] args) {
        List<String> StudentNames = new ArrayList<>();
        StudentNames.add("Alice");
        StudentNames.add("Bob");
        StudentNames.add("Charlie");
        //set of unique Student IDs
        Set<Integer>StudentIDs = new HashSet<>();
        StudentIDs.add(101);
        StudentIDs.add(102);
        StudentIDs.add(103);
        //Map of the name
        Map<Integer,String> StudentMap = new HashMap<>();
        StudentMap.put(101, "Alice");
        StudentMap.put(102, "Bob");
        StudentMap.put(103, "Charlie");
        //Print all the students(List)
        System.out.println("all Students list");
        for(String name:StudentNames){
            System.out.println(name);
        }
        //print all student Ids
        //look up for a ids(Map)
        int SearchId=102;
        System.out.println(StudentMap.get(SearchId));
        //sort student names,
        Collections.sort(StudentNames);
        System.out.println(StudentNames);
    }
}