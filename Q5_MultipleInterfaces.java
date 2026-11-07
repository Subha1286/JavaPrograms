// Exp-05 Q5: Multiple interfaces implementation in a single class
interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

class Machine implements Printer, Scanner {
    @Override
    public void print() {
        System.out.println("Print Doc");
    }

    @Override
    public void scan() {
        System.out.println("Scan Doc");
    }
}

public class Q5_MultipleInterfaces {
    public static void main(String[] args) {
        Machine m = new Machine();
        m.print();
        m.scan();
    }
}
