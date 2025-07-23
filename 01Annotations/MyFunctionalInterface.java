@FunctionalInterface
    interface Greeting {
        void sayHello();
    }
    public class MyFunctionalInterface {
  public static void main(String[] args) {
      Greeting myGreeting = ()-> System.out.println("Hello from Lambda!");
      myGreeting.sayHello();
  }  
}



