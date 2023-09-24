package Lizun7.B1;


public class Run {

    public static void main(String[] args) {
        BankAccount.Transaction myAccount = new BankAccount.Transaction();
        myAccount.putDeposit();
        myAccount.takeDeposit();
        myAccount.informAboutBalance();
    }
}