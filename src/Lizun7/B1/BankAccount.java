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
            // а где сама логика пополнения счёта?
            System.out.println(" You may put money in your deposit " + numberAccount);
        }
        /*
        класс Transaction должен иметь методы для записи депозита и снятия средств с баланса

        в доке немного подправил условие задачи.
         */

        void takeDeposit() {
            // а где сама логика снятия денег со счёта?
            System.out.println("You may take money with your deposit " + numberAccount);
        }

        void informAboutBalance() {
            System.out.println("Your balance is " + balance);
        }
    }

}

