package hometasks.getman.lesson2.task_b2;

import java.util.Arrays;

import hometasks.getman.util.Util;

public class HowManyWords {
    public static void main(String[] args) {
        String string = Util.scannerString();
        String[] strings = string.trim().split("(\\s+\\p{Punct}+\\s+|\\s+)");
        System.out.println(Arrays.toString(strings));
        System.out.println("Worlds in the string - " + strings.length);

    }
}
