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

        for (int i = 0; i < textForAlignment.split("\\n").length; i++) {
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
        stringForFormat = forDelete.reverse();

       /* do {
            //forDelete = new StringBuilder();

                    forDelete.append(stringForFormat.reverse().toString().replaceFirst("0{}", "0")).reverse();
            stringForFormat = forDelete;

        } while (forDelete.length() > maxLength);*/
        return stringForFormat;
    }

    public StringBuilder addSpacesIsBlank(int maxLength) {
        StringBuilder result = new StringBuilder();
        return result.append(" ".repeat(maxLength));
    }

    public StringBuilder addSpaces(String stringForFormat, int spaces) {
        StringBuilder result = new StringBuilder();
        int countOfWords = stringForFormat.trim().split("\\s").length;
        int countOfSpaces = (spaces + (stringForFormat.trim().split("\\s").length - 1)) / countOfWords;
        for (int i = 0; i < countOfWords - 1; i++) {
            result.append(stringForFormat.trim().split("\\s")[i]);
            for (int j = 0; j <= countOfSpaces; j++) {
                result.append(" ");
               /* if (result.length() + stringForFormat.trim().split("\\s")[countOfWords - 1].length() >= maxLength) {
                    break;
                }*/
            }

        }
        if (result.length() + stringForFormat.trim().split("\\s")[countOfWords - 1].length() < maxLength) {
            result = new StringBuilder(result.toString().replaceFirst(" ", "  "))
                    .append(stringForFormat.trim().split("\\s")[countOfWords - 1]);
            /*result= new StringBuilder();
            result.append(addSpaces(stringForFormat, spaces + 1))
                    .append(stringForFormat.trim().split("\\s")[countOfWords - 1]);*/
            // result.append("0").append(stringForFormat.trim().split("\\s")[countOfWords - 1]);
        } else {
            result.append(stringForFormat.trim().split("\\s")[countOfWords - 1]);
        }
        if (result.length() > maxLength) {
            return deleteSpaces(result, maxLength);
        }
        return result;
    }

}
