package Lizun6;

public class B2 {
    public static void main(String[] args) {

        B2.countWord("I love Java.  And I will learn     it.");
    }

    // тут аналогично с предыдущим заданием. нет метода, который принимает на вход строку.
    static void countWord(String text) {

        String[] words = text.split("\\s*(\\s|,|!|\\.)\\s*");
        System.out.print("В вашем предложении " + words.length + " слов.");
    }
}

