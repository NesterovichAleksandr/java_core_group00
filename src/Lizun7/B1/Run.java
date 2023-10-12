package Lizun7.B1;


public class Run {

    public static void main(String[] args) {
        BankAccount.numberAccount = 1426_5426;
        BankAccount.balance = 2000;

        /*
        когда мы создаём банковский счёт, его номер может повторяться? а как в коде выглядит создание нового счёта? как мы его создаём?

        смысл таков, что при создании нового счёта ему должен присваиваться рандомный номер счёта. этот номер мы не должны сами задавать в коде.
         */
        BankAccount.Transaction myAccount = new BankAccount.Transaction();
        myAccount.putDeposit();
        myAccount.takeDeposit();
        myAccount.informAboutBalance();
    }
}