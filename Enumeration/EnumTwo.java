package Enumeration;

public class EnumTwo {
    public static void main(String[] args) {
        Color c1 = Color.RED;

        System.out.println("Red enum name: " + c1.name());
        System.out.println("Red enum value: " + c1.getValue());

        Color c2 = Color.GREEN;
        System.out.println("Green enum name: " + c2.name());
        System.out.println("Green enum value: " + c2.getValue());

        Color c3 = Color.BLUE;          
        System.out.println("Blue enum name: " + c3.name());
        System.out.println("Blue enum value: " + c3.getValue()");

        for (Color color : Color.values()) {
            System.out.println(color.name() + " -> " + color.getValue());
        }
    }
}
