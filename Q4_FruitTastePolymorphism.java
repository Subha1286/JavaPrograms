// Exp-04 Q4: Polymorphism with base Fruit class and subclasses Apple & Orange
class Fruit {
    protected String name;
    protected String taste;
    protected String size;

    public Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    public void eat() {
        System.out.println("Eating " + name + " (Size: " + size + ") | Taste: " + taste);
    }
}

class Apple extends Fruit {
    public Apple(String name, String taste, String size) {
        super(name, taste, size);
    }

    @Override
    public void eat() {
        System.out.println("Crunching an apple: " + name + " (Size: " + size + ") is sweet and crisp.");
    }
}

class Orange extends Fruit {
    public Orange(String name, String taste, String size) {
        super(name, taste, size);
    }

    @Override
    public void eat() {
        System.out.println("Peeling and eating an orange: " + name + " (Size: " + size + ") is juicy and citrusy-tangy.");
    }
}

public class Q4_FruitTastePolymorphism {
    public static void main(String[] args) {
        Fruit genericFruit = new Fruit("Generic Fruit", "Bland", "Medium");
        genericFruit.eat();

        Apple apple = new Apple("Fuji Apple", "Sweet and Crisp", "Medium");
        apple.eat();

        Orange orange = new Orange("Navel Orange", "Citrusy and Tangy", "Large");
        orange.eat();
    }
}
