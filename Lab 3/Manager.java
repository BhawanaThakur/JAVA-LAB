class Employee{
    String name;
    double baseSalary;

    Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }
void displayEmployee() {
    System.out.println("Name: " + name);
    System.out.println("BaseSalary: " + baseSalary);
}
}
public class Manager extends Employee {
    String department;
    double bonus;

    Manager(String name, double baseSalary, double  bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }
    double CalculateTotalSalary() {
        return baseSalary + bonus;
    }
    void displayManager() {
        displayEmployee();
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + CalculateTotalSalary());
    }
    public static void main(String[] args) {
        Manager manager = new Manager("Bhawana", 50000, 10000);
        manager.displayManager();
    }
}
