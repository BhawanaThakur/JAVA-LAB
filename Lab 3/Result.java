class Student{
    String name;
    int marks;
    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
void displayStudent() {
    System.out.println("Name: " + name);    
    System.out.println("Marks: " + marks);
}
}
public class Result extends Student {
    String grade;

    Result(String name, int marks, String grade) {
        super(name, marks);
        this.grade = grade;
    }
    void displayResult() {
        displayStudent();
        System.out.println("Grade: " + grade);
    }
    public static void main(String[] args) {
        Result result = new Result("Bhawana", 85, "A");
        result.displayResult();
    }
}
