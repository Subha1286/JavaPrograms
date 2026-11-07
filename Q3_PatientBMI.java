// Exp-03 Q3: Patient class with BMI calculation
class Patient {
    String name;
    double height; // in meters
    double weight; // in kg

    Patient(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    void show() {
        System.out.println("Name of the patient: " + name);
        System.out.println("Height of the patient (m): " + height);
        System.out.println("Weight of the patient (kg): " + weight);
    }

    double computeBMI() {
        return weight / (height * height);
    }
}

public class Q3_PatientBMI {
    public static void main(String[] args) {
        Patient p = new Patient("Partha", 1.75, 68.0);
        p.show();
        System.out.printf("BMI: %.2f%n", p.computeBMI());
    }
}
