class Account{
    int accountNo;
    double balanace;
    Account(int accountNo, double balanace) {
        this.accountNo = accountNo;
        this.balanace = balanace;
    }   
void displayAccount() {
    System.out.println("Account No: " + accountNo);
    System.out.println("Balance: " + balanace);
}
}
public class SavingsAccount extends Account {
    double interestRate;

    SavingsAccount(int accountNo, double balanace, double interestRate) {
        super(accountNo, balanace);
        this.interestRate = interestRate;
    }
    void displaySavingsAccount() {
        displayAccount();
        System.out.println("Interest Rate: " + interestRate);
    }
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(12345, 1000.00, 5.0);
        savingsAccount.displaySavingsAccount();
    }
}   