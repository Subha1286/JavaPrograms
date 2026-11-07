// Exp-04 Q1: Method overriding between Animal and Bird
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }

    void sleep() {
        System.out.println("Animal sleeps");
    }
}

class Bird extends Animal {
    @Override
    void eat() {
        System.out.println("Bird eats");
    }

    @Override
    void sleep() {
        System.out.println("Bird sleeps");
    }

    void fly() {
        System.out.println("Birds fly");
    }
}

public class Q1_AnimalBirdOverriding {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();
        a.sleep();

        System.out.println();

        Bird b = new Bird();
        b.eat();
        b.sleep();
        b.fly();
    }
}
