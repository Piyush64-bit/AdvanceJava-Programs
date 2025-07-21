class Animal {
    void speak() {
        System.out.println("animal speaks");
    }
}

class Dog extends Animal {
    @Override // Annotations
    void speak() {
        System.out.println("dog barks");
    }
}

public class MyOverride {
    public static void main(String[] args) {
        Animal a1 = new Dog(); // Patent-Child Relations
        a1.speak();
    }
}