package hometasks.lesson6.lvlB.task4;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write down telephone number: ");
        String number = scanner.nextLine();
        if (number.strip().matches("^(\\+375)(17|25|29|33|44)(\\d{7})$")) {

        } else if (number.strip().matches("^(80)(17|25|29|33|44)(\\d{7})$")) {

        } else {
            System.out.println("Wrong number");
        }
    }
}
