package Lizun6;

public class B1 {
    public static void main(String[] args) {

        B1.palindrome("ioi");
    }

    public static void palindrome(String word) {

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
