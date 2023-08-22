package hometasks.getman.lesson2.task_b1;

import hometasks.getman.util.Util;

public class Palindrome {
    public static void main(String[] args) {
        StringBuilder text = new StringBuilder();
        text.append(Util.scannerString().replaceAll("\\s", ""));

        System.out.println(text.reverse());
        if (text.toString().equalsIgnoreCase(text.reverse().toString())) {
            System.out.println("This is a palindrome");
        } else {
            System.out.println("This is not a palindrome");
        }
    }
}
