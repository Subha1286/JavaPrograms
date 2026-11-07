package pack1;

public class AccessDemo {
    public int a = 10;
    protected int b = 20;
    int c = 30; // default / package-private
    private int d = 40;

    public void display() {
        System.out.println("Inside AccessDemo class:");
        System.out.println("Public: " + a);
        System.out.println("Protected: " + b);
        System.out.println("Default: " + c);
        System.out.println("Private: " + d);
    }
}
