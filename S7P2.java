import java.util.Scanner;
class Rectangle{
    int length;
    int width;
    Rectangle(int l, int w){
        length = l;
        width = w;
    }
 void area(){
    int a = length * width;
    System.out.println("Area of rectangle is ="+a);
 }}
 public class S7P2{
 public static void main(String args[]){
   Rectangle r1 = new Rectangle(10,20);
   r1.area();
 }
    

 }