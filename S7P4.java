class Book{
    String title;
    double price;
Book(){
    title="unknown";
    price=0.0;
}
Book(String t,double p){
    t=title;
    p=price;
}    
void display(){
    System.out.println("Title:"+title+"  Price:"+price);
}       
}
public class S7P4{
    public static void main(String[] args){
        Book b1 = new Book();
        b1.display();
    }
}