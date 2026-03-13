class Car{
    String brand;
    double price;
Car(){
    this("Unknown",0.0);
}    
Car(String b,double p){
    b=brand;
    p=price;
} 
void display(){
    System.out.println("Brand:"+brand+"\nPrice:"+price);
}   
}
public class S7P6{
    public static void main(String[] args){
        Car c1 = new Car();
        Car c2 = new Car("BMW",50000);
        c1.display();
        c2.display();
    }
}