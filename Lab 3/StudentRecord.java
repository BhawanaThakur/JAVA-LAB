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
public class StudentRecord extends Person {
    int rollNo;
    String course;

    StudentRecord(String name, int age, int rollNo, String course) {
        super(name, age);
        this.rollNo = rollNo;
        this.course = course;
    }
    void displayStudent() {
        displayPerson();
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
    }
    public static void main(String[] args) {
        StudentRecord student = new StudentRecord("Bhawana", 19, 003, "Computer Science");
        student.displayStudent();
    }}