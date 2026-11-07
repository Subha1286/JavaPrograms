// Exp-05 Q3: Default methods in interfaces
interface Greeting {
    void sayHello();

    default void sayBye() {
        System.out.println("Good Bye");
    }
}

class Person implements Greeting {
    @Override
    public void sayHello() {
        System.out.println("Hello");
    }
}

public class Q3_DefaultMethodInterface {
    public static void main(String[] args) {
        Greeting g = new Person();
        g.sayHello();
        g.sayBye();
    }
}
