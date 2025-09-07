public class BankAccount {
    // TODO: Create static variables:
// - bankName (String) - same for all accounts
// - totalAccounts (int) - count of all accounts created // - interestRate (double) - same rate for all accounts
    static String bankName;
    static int totalAccounts = 0;
    static double interestRate;
// TODO: Create instance variables:
// - accountNumber (String) - unique for each account
// - accountHolder (String) - unique for each account
// - balance (double) - unique for each account
    String accountNumber;
    String accountHolder;
    double balance;
// TODO: Create constructor that:
// - Initializes instance variables
// - Increments totalAccounts counter
    public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        totalAccounts++;
    }
// TODO: Create static methods:
// - setBankName(String name)
// - setInterestRate(double rate)
// - getTotalAccounts() - returns count
// - displayBankInfo() - shows bank name and total accounts
    public static void setBankName(String name) {
        bankName = name;
    }

    public static void setInterestRate(double rate) {
        interestRate = rate;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public static void displayBankInfo() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Total Accounts: " + totalAccounts);
        System.out.println("Interest Rate: " + interestRate);
    }
// TODO: Create instance methods:
// - deposit(double amount)
// - withdraw(double amount)
// - calculateInterest() - uses static interestRate
// - displayAccountInfo()
    public void deposit(double amount) {
        if(amount>0){
            balance += amount;
            System.out.println("deposited: " + amount);
        }
    }
    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
    public double calculateInterest(){
        return balance * interestRate / 100;
    }
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Earned: " + calculateInterest());
    }
    public static void main(String[] args) {
// TODO: Set bank name and interest rate using static methods // TODO: Create multiple BankAccount objects
// TODO: Show that static members are shared across all objects // TODO: Show that instance members are unique to each object
        BankAccount.setBankName("ICICI Bank");
        BankAccount.setInterestRate(5.0);
        BankAccount account1 = new BankAccount("0001", "Aryan", 1000.0);
        BankAccount account2 = new BankAccount("0002", "Rohan", 2000.0);
        BankAccount account3 = new BankAccount("0003", "Sita", 3000.0);
// TODO: Demonstrate calling static methods with and without objects
        BankAccount.displayBankInfo();
        System.out.println("Total Accounts: " + BankAccount.getTotalAccounts());

        account1.deposit(500);
        account1.withdraw(200);
        account1.displayAccountInfo();

        account2.deposit(1000);
        account2.withdraw(500);
        account2.displayAccountInfo();

        account3.deposit(1500);
        account3.withdraw(700);
        account3.displayAccountInfo();

        // Show that static members are shared
        System.out.println("Bank Name from Account 1: " + bankName);
        System.out.println("Bank Name from Account 2: " + bankName);
        System.out.println("Bank Name from Account 3: " + bankName);

    }
}