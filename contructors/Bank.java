import java.util.Random;

class BankAccount {
  String accountHolder;
  int accountNumber;
  double balance;

  BankAccount() {
    this.accountHolder = "Unknown";
    this.accountNumber = generateAccountNumber();
    this.balance = 0.0;
  }

  BankAccount(String accountHolder) {
    this.accountHolder = accountHolder;
    this.accountNumber = generateAccountNumber();
    this.balance = 0.0;
  }

  BankAccount(String accountHolder, double balance) {
    this.accountHolder = accountHolder;
    this.accountNumber = generateAccountNumber();
    this.balance = balance;
  }

  private int generateAccountNumber() {
    Random rand = new Random();
    return 100000 + rand.nextInt(900000);
  }

  void deposit(double amount) {
    if (amount > 0) {
      balance += amount;
      System.out.println("Deposited: " + amount);
    } else {
      System.out.println("Invalid deposit amount");
    }
  }

  void withdraw(double amount) {
    if (amount > 0 && amount <= balance) {
      balance -= amount;
      System.out.println("Withdrawn: " + amount);
    } else {
      System.out.println("Insufficient balance or invalid amount");
    }
  }

  void displayAccount() {
    System.out.println("Account Details:");
    System.out.println("Holder: " + accountHolder);
    System.out.println("Account No: " + accountNumber);
    System.out.println("Balance: " + balance);
    System.out.println("-------------------------");
  }
}

public class Bank {
  public static void main(String[] args) {
    BankAccount acc1 = new BankAccount();
    BankAccount acc2 = new BankAccount("Aryan");
    BankAccount acc3 = new BankAccount("Garg", 5000.0);

    acc1.deposit(1000);
    acc1.withdraw(500);
    acc1.displayAccount();

    acc2.deposit(2000);
    acc2.withdraw(2500);
    acc2.displayAccount();

    acc3.withdraw(1000);
    acc3.deposit(2000);
    acc3.displayAccount();
  }
}
