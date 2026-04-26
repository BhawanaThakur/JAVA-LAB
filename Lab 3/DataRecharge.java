class Recharge {
    String mobileNo;
    double amount;
    Recharge(String mobileNo, double amount) {
        this.mobileNo = mobileNo;
        this.amount = amount;
    }
void displayRecharge() {
    System.out.println("Mobile No: " + mobileNo);
    System.out.println("Amount: " + amount);
}
}
public class DataRecharge extends Recharge {
    String operator;

    DataRecharge(String mobileNo, double amount, String operator) {
        super(mobileNo, amount);
        this.operator = operator;
    }
    void displayDataRecharge() {
        displayRecharge();
        System.out.println("Operator: " + operator);
    }
    public static void main(String[] args) {
        DataRecharge dataRecharge = new DataRecharge("9876543210", 349.00, "Jio");
        dataRecharge.displayDataRecharge();
    }
}