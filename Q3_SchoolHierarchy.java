// Exp-04 Q3: Multilevel and hierarchical inheritance in school system
class Person {
    private String name;
    private String dob;

    public Person(String name, String dob) {
        this.name = name;
        this.dob = dob;
    }

    public void displayPersonDetails() {
        System.out.println("Name: " + name + ", D.O.B: " + dob);
    }
}

class Teacher extends Person {
    private double salary;
    private String subject;

    public Teacher(String name, String dob, double salary, String subject) {
        super(name, dob);
        this.salary = salary;
        this.subject = subject;
    }

    public void displayTeacherDetails() {
        displayPersonDetails();
        System.out.println("Role: Teacher | Subject: " + subject + ", Salary: ₹" + salary);
    }
}

class Student extends Person {
    private int studentId;

    public Student(String name, String dob, int studentId) {
        super(name, dob);
        this.studentId = studentId;
    }

    public void displayStudentDetails() {
        displayPersonDetails();
        System.out.println("Role: Student | Student ID: " + studentId);
    }
}

class CollegeStudent extends Student {
    private String collegeName;
    private String studyingYear;

    public CollegeStudent(String name, String dob, int studentId, String collegeName, String studyingYear) {
        super(name, dob, studentId);
        this.collegeName = collegeName;
        this.studyingYear = studyingYear;
    }

    public void displayCollegeStudentDetails() {
        displayStudentDetails();
        System.out.println("College: " + collegeName + ", Year: " + studyingYear);
    }
}

public class Q3_SchoolHierarchy {
    public static void main(String[] args) {
        System.out.println("--- Person ---");
        Person p = new Person("Partha Sarathi", "25/03/2007");
        p.displayPersonDetails();

        System.out.println("\n--- Teacher ---");
        Teacher t = new Teacher("Mousumi Das", "14/08/1985", 65000.0, "Computer Applications");
        t.displayTeacherDetails();

        System.out.println("\n--- Student ---");
        Student s = new Student("Kamal", "12/04/2006", 101);
        s.displayStudentDetails();

        System.out.println("\n--- College Student ---");
        CollegeStudent cs = new CollegeStudent("Himanshu", "18/09/2006", 87, "GIET University", "2nd Year B.Tech");
        cs.displayCollegeStudentDetails();
    }
}
