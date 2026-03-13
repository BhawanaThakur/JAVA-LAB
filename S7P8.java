class Student{
    String name;
    int rollno;
    String Branch;
    Student(String name,int rollno,String Branch){
        this.name=name;
        this.rollno=rollno;
        this.Branch=Branch;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Roll No: "+rollno);
        System.out.println("Branch: "+Branch);
    }
}
public class S7P8 {
    public static void main(String[] args) {
       Student[] s1 = {
        new Student("Bhawana",3,"Computer Science"),
        new Student("Noor",29,"Computer Science")
       };
        for(Student student : s1) {
            student.display();
       }
    }
}