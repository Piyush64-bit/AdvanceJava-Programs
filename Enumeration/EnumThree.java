package Enumeration;


        enum Day{
            MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
        }

        public class EnumThree {
    public static void main(String[] args) {
        Day today = Day.MONDAY;
        switch(today) {
        case MONDAY:
            System.out.println("Start of the Week");
            break;
        case FRIDAY:
            System.out.println("End of the Week");
            break;
        default:
            System.out.println("Mid of the Week");
        }
    }
}
