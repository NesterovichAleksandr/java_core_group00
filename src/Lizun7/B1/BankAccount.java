package Lizun7.B1;

public class BankAccount {
    private static long numberAccount = 256900002;
    private static int balance = 15000;

    static class Transaction {
        void putDeposit() {
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

