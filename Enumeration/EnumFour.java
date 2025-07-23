package Enumeration;

enum Ship{
           PLACED, SHIPPED, DELIVERED, CANCELLED
        }

public class EnumFour {
    public static void main(String[] args) {
       Ship s1 = Ship.PLACED;
        System.out.println("Order status: " + s1);

        switch (s1) {
            case PLACED:
            System.out.println("Your order has been placed.");
            break;
            case SHIPPED:
            System.out.println("Your order is on the way.");
            break;
            case DELIVERED:
            System.out.println("Your order has been delivered.");
            break;
            case CANCELLED:
            System.out.println("Your order was cancelled.");
            break;
        }
    }
}
