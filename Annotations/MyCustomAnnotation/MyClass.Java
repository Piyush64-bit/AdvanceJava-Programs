package MyCustomAnnotation;

public class MyClass {
    @Info(author = "Groot", description = "This is a sample method")
    public void myMethod() {
        String name;
    }

    @Info(author = "Groot")
    public void sayHello () {
        System.out.println("Hello");
    }
}