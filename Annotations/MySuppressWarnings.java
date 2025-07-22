public class MySuppressWarnings {
    @SuppressWarnings({"deprecation", "unused"})
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        // using the deprecated method
        calc.oldMethod();
        int unusedVar = 10;
    }

}