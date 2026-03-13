class Bank{
    String accountHolderName;
    double balance;
    Bank(String ac,double bal){
        accountHolderName=ac;
        balance=bal;
 }
 void setData(String ac,double bal){
     accountHolderName=ac;
     balance=bal;
 }
 void deposit(double amount){
     balance+=amount;
 }
 void getData(){
     System.out.println("Account Holder Name: "+accountHolderName);
     System.out.println("Balance: "+balance);
 }
}
public class S7P9 {
    public static void main(String[] args) {
        Bank b1 = new Bank("Bhawana",1000);
        b1.deposit(500);
        b1.getData();
    }
}
