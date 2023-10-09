package Lizun7.B1;


public class Run {

    public static void main(String[] args) {
        BankAccount.numberAccount = 1426_5426;
        BankAccount.balance = 2000;

        BankAccount.Transaction myAccount = new BankAccount.Transaction();
        myAccount.putDeposit();
        myAccount.takeDeposit();
        myAccount.informAboutBalance();
    }
}