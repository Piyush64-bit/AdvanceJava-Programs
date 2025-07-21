class Calculator {
@Deprecated
void oldMethod() {
    System.out.println("Old Method, not recommended");
}
void newMethod() {
System.out.println("New Method: Use this method");
}
}


public class MyDeprecated {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.oldMethod();
        calc.newMethod();
    }
}
