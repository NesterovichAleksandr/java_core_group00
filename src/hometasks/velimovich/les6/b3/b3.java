package hometasks.velimovich.les6.b3;

import java.util.Scanner;

public class b3 {
    public static void main(String[] args) {
        System.out.println("Введите слово");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine().toLowerCase();
        String vowels = "аяуюоеёэиы";
        int cons = 0, vows = 0; // для чего объявлена переменная cons?
        for (char c : str.toCharArray()) {
            if (c == ' ') {
                continue;
            }
            if (vowels.indexOf(c) != -1) {
                vows++;
            }
        }
        System.out.println("Гласных: " + vows);
    }
}
