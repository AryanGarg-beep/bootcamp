import java.util.*;

class PersonalAccount {
  private String accountHolderName;
  private String accountNumber;
  private double currentBalance;
  private double totalIncome;
  private double totalExpenses;

  private static int totalAccounts = 0;
  private static String bankName = "Default Bank";

  public PersonalAccount(String accountHolderName) {
    this.accountHolderName = accountHolderName;
    this.accountNumber = generateAccountNumber();
    this.currentBalance = 0.0;
    this.totalIncome = 0.0;
    this.totalExpenses = 0.0;
    totalAccounts++;
  }

  public void addIncome(double amount, String description) {
    if (amount > 0) {
      totalIncome += amount;
      currentBalance += amount;
      System.out.println(accountHolderName + " received income: " + description + " (₹" + amount + ")");
    } else {
      System.out.println("Income must be positive!");
    }
  }

  public void addExpense(double amount, String description) {
    if (amount > 0 && amount <= currentBalance) {
      totalExpenses += amount;
      currentBalance -= amount;
      System.out.println(accountHolderName + " spent on: " + description + " (₹" + amount + ")");
    } else {
      System.out.println("Invalid expense! Either negative or exceeds balance.");
    }
  }

  public double calculateSavings() {
    return totalIncome - totalExpenses;
  }

  public void displayAccountSummary() {
    System.out.println("\n--- Account Summary ---");
    System.out.println("Bank Name      : " + bankName);
    System.out.println("Account Holder : " + accountHolderName);
    System.out.println("Account Number : " + accountNumber);
    System.out.println("Total Income   : ₹" + totalIncome);
    System.out.println("Total Expenses : ₹" + totalExpenses);
    System.out.println("Current Balance: ₹" + currentBalance);
    System.out.println("Savings        : ₹" + calculateSavings());
  }

  public static void setBankName(String name) {
    bankName = name;
  }

  public static int getTotalAccounts() {
    return totalAccounts;
  }

  public static String generateAccountNumber() {
    return "ACCT" + (1000 + totalAccounts + 1);
  }
}

public class FinanceManager {
  public static void main(String[] args) {
    PersonalAccount.setBankName("Smart Finance Bank");

    PersonalAccount acc1 = new PersonalAccount("Aryan Garg");
    PersonalAccount acc2 = new PersonalAccount("Ritu Sharma");
    PersonalAccount acc3 = new PersonalAccount("John Doe");

    acc1.addIncome(5000, "Salary");
    acc1.addExpense(1200, "Groceries");

    acc2.addIncome(10000, "Freelance Project");
    acc2.addExpense(4000, "Rent");

    acc3.addIncome(8000, "Part-time Job");
    acc3.addExpense(2000, "Travel");

    acc1.displayAccountSummary();
    acc2.displayAccountSummary();
    acc3.displayAccountSummary();

    System.out.println("\nTotal accounts created: " + PersonalAccount.getTotalAccounts());
    System.out.println("Bank name (shared): " + PersonalAccount.bankName);
  }
}
