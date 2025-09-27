public class SecureBankAccount {
  // TODO: Create private fields that should NEVER be accessed directly: // -
  // accountNumber (String) - read-only after creation
  // - balance (double) - only modified through controlled methods // - pin (int)
  // - write-only for security
  // - isLocked (boolean) - internal security state
  // - failedAttempts (int) - internal security counter
  private double balance;
  private boolean isLocked;
  private int failedAttempts;
  private final String accountNumber;
  private int pin;

  // TODO: Create private constants:
  // - MAX_FAILED_ATTEMPTS (int) = 3
  // - MIN_BALANCE (double) = 0.0
  private static final int MAX_FAILED_ATTEMPTS = 3;
  private static final double MIN_BALANCE = 0.0;

  // TODO: Create constructor that takes accountNumber and initial balance //
  // TODO: Initialize pin to 0 (must be set separately)
  // TODO: Create PUBLIC methods for controlled access:
  // Account Info Methods:
  // - getAccountNumber() - returns account number
  // - getBalance() - returns current balance (only if not locked)
  // - isAccountLocked() - returns lock status
  public String getAccountNumber() {
    return accountNumber;
  }

  public double getBalance() {
    if (isLocked) {
      return -1;
    }
    return balance;

  }

  public boolean isAccountLocked() {
    return isLocked;
  }

  //
  public SecureBankAccount(String accountNumber, double initialBalance) {
    this.accountNumber = accountNumber;
    this.balance = Math.max(initialBalance, MIN_BALANCE);
    this.pin = 0;
    this.isLocked = false;
    this.failedAttempts = 0;
  }

  // TODO :Security Methods:
  // - setPin(int oldPin, int newPin) - changes PIN if old PIN correct
  // - validatePin(int enteredPin) - checks PIN, handles failed attempts
  // - unlockAccount(int correctPin) - unlocks if PIN correct
  public boolean setPin(int oldPin, int newPin) {
    if (this.pin == oldPin) {
      this.pin = newPin;
      return true;
    }
    return false;
  }

  public boolean validatePin(int enteredPin) {
    if (isLocked) {
      System.out.println("Account is locked: ");
      return false;
    }
    if (this.pin == enteredPin) {
      resetFailedAttempts();
      return true;
    } else {
      incrementFailedAttempts();
      return false;
    }
  }

  //
  // TODO :Transaction Methods:
  // - deposit(double amount, int pin) - adds money if PIN valid
  // - withdraw(double amount, int pin) - removes money if PIN valid and
  // sufficient funds // - transfer(SecureBankAccount target, double amount, int
  // pin) - transfers between accounts
  //
  public boolean deposit(double amount, int pin) {
    if (validatePin(pin) && amount > 0) {
      balance += amount;
      return true;
    }
    return false;
  }

  public boolean withdraw(double amount, int pin) {
    if (validatePin(pin) && (amount > 0) && (balance - amount >= MIN_BALANCE)) {
      balance -= amount;
      return true;
    }
    return false;
  }

  public boolean transfer(SecureBankAccount target, double amount, int pin) {
    if (this.withdraw(amount, pin)) {
      target.balance += amount;
      return true;
    }
    return false;
  }

  //
  //
  //
  // TODO: Create private helper methods:
  // - lockAccount() - sets isLocked to true
  // - resetFailedAttempts() - resets counter to 0
  // - incrementFailedAttempts() - increases counter, locks if needed
  private void lockAccount() {
    isLocked = true;
  }

  private void resetFailedAttempts() {
    failedAttempts = 0;
  }

  private void incrementFailedAttempts() {
    failedAttempts++;
    if (failedAttempts >= MAX_FAILED_ATTEMPTS) {
      lockAccount();
      System.out.println("Account locked due to too many failed attempts");
    }
  }

  public static void main(String[] args) {
    // TODO: Create two SecureBankAccount objects
    // TODO: Try to access private fields directly (should fail)
    // TODO: Demonstrate proper usage through public methods:
    // - Set PINs for both accounts
    // - Make deposits and withdrawals
    // - Show security features (account locking)
    // - Transfer money between accounts
    SecureBankAccount acc1 = new SecureBankAccount("ACC123", 500);
    SecureBankAccount acc2 = new SecureBankAccount("ACC456", 300);

    // TODO: Attempt security breaches:
    // - Wrong PIN multiple times
    // - Withdrawing more than balance
    // - Operating on locked account
    acc1.setPin(0, 1234);
    acc2.setPin(0, 4321);

    acc1.deposit(200, 1234);
    acc1.withdraw(100, 1234);
    System.out.println("Acc1 balance: " + acc1.getBalance());

    // Transfer
    acc1.transfer(acc2, 50, 1234);
    System.out.println("Acc2 balance: " + acc2.getBalance());

    // Wrong PIN attempts
    acc1.withdraw(50, 9999);
    acc1.withdraw(50, 9999);
    acc1.withdraw(50, 9999); // account locked

    // Try operating on locked account
    acc1.withdraw(10, 1234);
  }
}
