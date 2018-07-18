package secao7.bankExercise;

/**
 * * created by lgcaobianco on 17/07/18
 **/

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();1
        account1.setName("meu pau de oculos");

        VipAccount account2 = new VipAccount();
        System.out.println(account2.getName());

        VipAccount account3 = new VipAccount("bob", 2000);
        System.out.println(account3.getName());

        VipAccount account4 = new VipAccount("meu Pau with Glasses", 10000);
        System.out.println(account4.getName());





    }
}
