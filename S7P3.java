class Employee{
    String name;
    String designation;
    double salary;
    Employee(String n,String d,double s){
         name=n;
         salary=s;
         designation=d;
 }
}
public class S7P3{
    public static void main(String[] args){
        Employee e1 = new Employee("NOOR","Manager",50000);
        System.out.println("Name:"+e1.name);
        System.out.println("Designation:"+e1.designation);
        System.out.println("Salary:"+e1.salary);
    }
}