class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
void displayPerson() {
    System.out.println("Name: " + name);    
    System.out.println("Age: " + age);
}
}
public class Patient extends Person {
    String disease;
    String doctorName;

    Patient(String name, int age, String disease, String doctorName) {
        super(name, age);
        this.disease = disease;
        this.doctorName = doctorName;
    }
    void displayPatient() {
        displayPerson();
        System.out.println("Disease: " + disease);
        System.out.println("Doctor Name: " + doctorName);
    }
    public static void main(String[] args) {
        Patient patient = new Patient("Bhawana", 19, "ALzheimers Disease", "Dr. Pallvi");
        patient.displayPatient();
    }
}
