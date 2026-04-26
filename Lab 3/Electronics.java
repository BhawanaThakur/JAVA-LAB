class Product {
    String name;
    double price;
    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
void displayProduct() {
    System.out.println("Product Name: " + name);    
    System.out.println("Price: " + price);

}
}
public class Electronics extends Product {
    String warrantyPeriod;

    Electronics(String name, double price, String warrantyPeriod) {
        super(name, price);
        this.warrantyPeriod = warrantyPeriod;
    }
    void displayElectronics() {
        displayProduct();
        System.out.println("Warranty Period: " + warrantyPeriod);
    }
    public static void main(String[] args) {
        Electronics electronic = new Electronics("Smartphone", 999.99,  "1 year");
        electronic.displayElectronics();
    }
}