import java.util.Scanner;
class Student{
    int roll;
    String name;
    Student(int r, String n){
        roll = r;
        name = n;
    }
 void display(){
    System.out.println("Name:"+name+"Roll no ="+roll);
 }}
 public class S7P1{
 public static void main(String args[]){
   Student s1 = new Student("NOOR",29);
   s1.display();
 }
    

 }   