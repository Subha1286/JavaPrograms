package pack1;

public class TestAccess {
    public static void main(String[] args) {
        AccessDemo obj = new AccessDemo();
        System.out.println("Accessing members in same package:");
        System.out.println("Public: " + obj.a);
        System.out.println("Protected: " + obj.b);
        System.out.println("Default: " + obj.c);
        // obj.d is private and inaccessible here

        System.out.println("\nCalling display() method:");
        obj.display();
    }
}
