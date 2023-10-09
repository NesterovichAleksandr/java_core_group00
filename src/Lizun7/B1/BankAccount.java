package Lizun7.B1;

public class BankAccount {

    static long numberAccount;
    static int balance;

    public BankAccount(long numberAccount, int balance) {
        this.numberAccount = numberAccount;
        this.balance = balance;
    }

    static class Transaction {

        static void putDeposit() {
            System.out.println(" You may put money in your deposit " + numberAccount);
        }

        void takeDeposit() {
            System.out.println("You may take money with your deposit " + numberAccount);
        }

        void informAboutBalance() {
            System.out.println("Your balance is " + balance);
        }
    }

}

