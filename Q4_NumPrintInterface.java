// Exp-05 Q4: Interface method with parameter
interface NumPrint {
    void printNum(Integer num);
}

class Number implements NumPrint {
    @Override
    public void printNum(Integer num) {
        System.out.println("Number: " + num);
    }
}

public class Q4_NumPrintInterface {
    public static void main(String[] args) {
        NumPrint p = new Number();
        p.printNum(25);
    }
}
