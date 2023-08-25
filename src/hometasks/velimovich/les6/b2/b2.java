package hometasks.velimovich.les6.b2;

import java.util.Scanner;

public class b2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите предложение");
        String input = scan.nextLine();
        int count = 0;
        if (input.length() != 0) {
            count++;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == ' ') {
                    count++;
                }
            }
        }
        // есть более короткое решение. в будущем можно будет подумать над другим решение. задача засчитана.
        System.out.println("Вы ввели " + count + " слов");
    }
}
