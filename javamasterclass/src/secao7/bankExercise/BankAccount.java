package secao7.bankExercise;

/**
 * * created by lgcaobianco on 17/07/18
 **/

public class BankAccount {
    private double balance;
    private int accountNumber;
    private double customerName;
    private String name;
    private String phoneNumber;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getCustomerName() {
        return customerName;
    }

    public void setCustomerName(double customerName) {
        this.customerName = customerName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
