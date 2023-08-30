package hometasks.getman.lesson6.task_c2;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextAlignment {

    private final String textForAlignment;
    private final StringBuilder textAfterAlignment = new StringBuilder();
    private int maxLength = 0;

    public TextAlignment(String textForAlignment) {
        this.textForAlignment = textForAlignment;
    }

    public String[] textToArray() {
        return textForAlignment.split("\\n");
    }

    public void maxLength(String[] text) {
        for (String s : text) {
            if (maxLength < s.length()) {
                maxLength = s.length();
            }
        }
//        System.out.println(maxLength);
    }

    public void formatText() {

        for (int i = 0; i < textForAlignment.trim().split("\\n").length; i++) {
            String stringForFormat = textForAlignment.trim().split("\\n")[i];
            if (stringForFormat.isBlank()) {
                textAfterAlignment.append(addSpacesIsBlank(maxLength)).append("\n");
            } else if (maxLength > stringForFormat.length()) {
                int spaces = maxLength - stringForFormat.length();
                textAfterAlignment.append(addSpaces(stringForFormat, spaces)).append("\n");
            } else {
                textAfterAlignment.append(stringForFormat).append("\n");
            }
        }
        System.out.println(textAfterAlignment);
    }


    public StringBuilder deleteSpaces(StringBuilder stringForFormat, int maxLength) {
        StringBuilder forDelete = new StringBuilder(stringForFormat.reverse());
        do {
            Pattern pattern = Pattern.compile("\\s+");
            Matcher matcher = pattern.matcher(forDelete);
            String space = " ";
            while (matcher.find()) {
                int countOfSpace = matcher.group().length();
                forDelete.replace(matcher.start(), matcher.end(), space.repeat(countOfSpace - 1));
                if (forDelete.length() == maxLength) {
                    break;
                }
            }
        } while (forDelete.length() != maxLength);
        stringForFormat = forDelete.reverse();

        return stringForFormat;
    }

    public StringBuilder addSpaces(StringBuilder stringForFormat, int maxLength) {

        do {
            Pattern pattern = Pattern.compile("\\s{2,}");
            Matcher matcher = pattern.matcher(stringForFormat);
            String space = " ";
            while (matcher.find()) {
                int countOfSpace = matcher.group().length();
                stringForFormat.replace(matcher.start(), matcher.end(), space.repeat(countOfSpace + 1));
                if (stringForFormat.length() == maxLength) {
                    break;
                }
            }
        } while (stringForFormat.length() != maxLength);

        return stringForFormat;
    }

    public StringBuilder addSpacesIsBlank(int maxLength) {
        StringBuilder result = new StringBuilder();
        return result.append(" ".repeat(maxLength));
    }

    public StringBuilder addSpaces(String stringForFormat, int spaces) {
        StringBuilder result = new StringBuilder();

        int countOfWords = stringForFormat.trim().split("\\s+").length;
        int countOfSpaces = (spaces + (countOfWords - 1)) / countOfWords;

        for (int i = 0; i < countOfWords - 1; i++) {
            result.append(stringForFormat.trim().split("\\s+")[i]);
            result.append(" ".repeat(countOfSpaces + 1));
        }

        if (result.length() + stringForFormat.trim().split("\\s+")[countOfWords - 1].length() < maxLength) {
            result.append(stringForFormat.trim().split("\\s+")[countOfWords - 1]);
            result = addSpaces(result, maxLength);
        } else {
            result.append(stringForFormat.trim().split("\\s+")[countOfWords - 1]);
        }
        if (result.length() > maxLength) {
            return deleteSpaces(result, maxLength);
        }
        return result;
    }

}
