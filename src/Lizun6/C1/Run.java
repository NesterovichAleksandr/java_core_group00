package Lizun6.C1;

import static hometasks.appendix.Versh.versh;

public class Run {
    public static void main(String[] args) {

        countSymbolsInSentences();
    }

    public static void countSymbolsInSentences() {

        String text = versh.replaceAll("\n", " ");

        String[] arrayVersh = text.split("[\\.\\!\\?]");

        for (int i = arrayVersh.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arrayVersh[j].length() > arrayVersh[j + 1].length()) {
                    String temp = arrayVersh[j];
                    arrayVersh[j] = arrayVersh[j + 1];
                    arrayVersh[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arrayVersh.length; i++)
            System.out.println(arrayVersh[i]);
    }
}








