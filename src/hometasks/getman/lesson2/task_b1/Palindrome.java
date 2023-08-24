package hometasks.getman.lesson2.task_b1;

import hometasks.getman.util.Util;

public class Palindrome {
    private String text;

    public Palindrome(String text) {
        this.text = text;
    }

    public void palindrome() {
        StringBuilder palindrome = new StringBuilder();
        palindrome.append(text.replaceAll("\\s", ""));

        if (palindrome.toString().equalsIgnoreCase(palindrome.reverse().toString())) {
            System.out.println("This is a palindrome");
        } else {
            System.out.println("This is not a palindrome");
        }
    }
}
