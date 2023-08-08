package Lizun6;

import java.util.Scanner;

public class B1 {
    public static void main(String[] args) {
        System.out.println("Введите слово или число");
        B1.palindrome();
    }
    static void palindrome() {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        StringBuilder builder = new StringBuilder(word);
        builder.reverse();
        String newWord = builder.toString();
        if (word.equals(newWord)) {
            System.out.println("Это палиндром");
        } else {
            System.out.println("Это не палиндром");
        }
    }
}
