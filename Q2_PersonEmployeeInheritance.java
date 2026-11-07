// Exp-04 Q2: Single inheritance and constructor chaining with super()
class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

class Employee extends Person {
    int empId;
    double salary;
    int startYear;
    String insuranceNumber;

    Employee(String name, int empId, double salary, int startYear, String insuranceNumber) {
        super(name);
        this.empId = empId;
        this.salary = salary;
        this.startYear = startYear;
        this.insuranceNumber = insuranceNumber;
    }

    void display() {
        System.out.println("--- Employee Details ---");
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + empId);
        System.out.println("Annual Salary: ₹" + salary);
        System.out.println("Year of Joining: " + startYear);
        System.out.println("National Insurance Number: " + insuranceNumber);
    }
}

public class Q2_PersonEmployeeInheritance {
    public static void main(String[] args) {
        Employee emp = new Employee("Ansh", 101, 70000.0, 2017, "PKS234");
        emp.display();
    }
}
