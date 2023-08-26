package hometasks.getman.lesson6.task_b2;

import java.util.Arrays;

import hometasks.getman.util.Util;

public class HowManyWords {
    public static void main(String[] args) {
        HowManyWords.howManyWords(Util.scannerString());
    }

    public static void howManyWords(String text) {
        String[] strings = text.trim().split("(\\s+\\p{Punct}+\\s+|\\s+)");
        System.out.println(Arrays.toString(strings));
        System.out.println("Worlds in the string - " + strings.length);
    }
}
