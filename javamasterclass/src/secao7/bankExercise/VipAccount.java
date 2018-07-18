package secao7.bankExercise;

/**
 * * created by lgcaobianco on 17/07/18
 **/

public class VipAccount {
    private String name;
    private String emailAddress;
    private double creditLimit;

    VipAccount() {
        this("default name", "default email", 1000d);
    }

    public VipAccount(String name, double creditLimit) {
        this(name, "default email", 1000d);

    }

    public VipAccount(String name, String emailAddress, double creditLimit) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.creditLimit = creditLimit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }
}
