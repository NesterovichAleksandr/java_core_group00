package hometasks.velimovich.les6.b1;

import java.util.Scanner;

public class b1 {
    public static void main(String[] args) {
        System.out.println("Введите слово для проверки");
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        System.out.println("Вы ввели слово " + word);
        if (word.equals((new StringBuffer(word)).reverse().toString()))  // красивое решение!)
            System.out.print("Палиндром");
        else
            System.out.print("Не палиндром");
    }

}
