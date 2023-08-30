package hometasks.getman.lesson6.task_c2;

import hometasks.appendix.Versh;

public class Main {
    public static void main(String[] args) {
        TextAlignment textAlignment = new TextAlignment(Versh.versh);
        textAlignment.maxLength(textAlignment.textToArray());
        textAlignment.formatText();

    }
}
