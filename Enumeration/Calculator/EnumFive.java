package Enumeration.Calculator;

enum Calculator {
    ADD{
        public double apply(double x, double y) {
            return x + y;
        }
    },
    SUBTRACT{
        public double apply(double x, double y) {
            return x - y;}
    },
    MULTIPLY{
        public double apply(double x, double y) {
            return x * y;
        }
    },
    DIVIDE{
        public double apply(double x, double y) {
            return x / y;
        }
    };

    public abstract double apply(double x, double y);
}

public class EnumFive {
    public static void main(String[] args) {
        double x = 10; y = 5;
        for (Calculator op : Calculator.values()) {
            System.out.println("")
    }
}
