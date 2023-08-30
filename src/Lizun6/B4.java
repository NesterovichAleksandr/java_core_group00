package Lizun6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class B4 {
    public static void main(String[] args) {
        B4.searchNumber("293577147");
    }

    static void searchNumber(String callNumber) {
        Pattern searchA1 = Pattern.compile("^(29[136].{6}$)|^(44).{7}$");
        Matcher a1 = searchA1.matcher(callNumber);

        Pattern searchMTC = Pattern.compile("^(29[257].{6}$|33.{7}$)");
        Matcher mtc = searchMTC.matcher(callNumber);

        Pattern searchLife = Pattern.compile("^(25.{7}$)");
        Matcher life = searchLife.matcher(callNumber);

        Pattern searchTown = Pattern.compile("^(17.{7}$)");
        Matcher town = searchTown.matcher(callNumber);

        if (a1.find()) System.out.println("Ваш сотовый оператор \"А1\"");
        else if (mtc.find()) System.out.println("Ваш оператор \"МТС\"");
        else if (life.find()) System.out.println("Ваш оператор \"LIFE\"");
        else if (town.find()) System.out.println("Это городской телефон");
        else System.out.println("Неправильно введен номер");

    }
}