package hometasks.velimovich.les6.a3;

import java.util.Scanner;

public class a3 {
    public static void main(String[] args) {
        System.out.println("Введите число от 0 до 3: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number == 0) {
            System.out.println("Вы ввели 0");
        } else if (number == 1) {
            System.out.println("Вы ввели 1");
        } else if (number == 2) {
            System.out.println("Вы ввели 2");
        } else if (number == 3) {
            System.out.println("Вы ввели 3");
        } else if (number > 3 | number < 0) {
            do {
                System.out.println("Неверно. Введите число от 0 до 3: ");
                System.out.println("Введите число от 0 до 3: ");
                Scanner scan2 = new Scanner(System.in);
                int number2 = scan2.nextInt();
                number = number2;
            } while (number > 3 | number < 0);
            if (number == 0) {
                System.out.println("Вы ввели 0");
            } else if (number == 1) {
                System.out.println("Вы ввели 1");
            } else if (number == 2) {
                System.out.println("Вы ввели 2");
            } else if (number == 3) {
                System.out.println("Вы ввели 3");

            }

        }
    }
}
