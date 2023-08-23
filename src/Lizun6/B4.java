package Lizun6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class B4 {
    public static void main(String[] args) {
        System.out.println("Введите номер телефона (9 цифр), чтобы узнать оператора");
        B4.searchNumber();
    }

    // мы ищем номер? или мы проверяем номер?)
    public static void searchNumber() {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        // в идеальном случае метод должен выполнять только одну задачу.
        // т е определять оператора, а тут этот метод ещё содержит код, который считывает текст с консоли.
        // сканер лучше вынести в метод main. это для того, что не всегда с консоли получаем информацию.. и для этого этот метод должен ПРИНИМАТЬ на вход готовый номер. (это опять условие задачи) нужно мне думать над формулировкой)
        Pattern searchA1 = Pattern.compile("^(29[136].{6}$)|^(44).{7}$");
        Matcher a1 = searchA1.matcher(num);

        Pattern searchMTC = Pattern.compile("^(29[257].{6}$|33.{7}$)");
        Matcher mtc = searchMTC.matcher(num);

        Pattern searchLife = Pattern.compile("^(25.{7}$)");
        Matcher life = searchLife.matcher(num);

        Pattern searchTown = Pattern.compile("^(17.{7}$)");
        Matcher town = searchTown.matcher(num);

        if (a1.find()) System.out.println("Ваш сотовый оператор \"А1\"");
        else if (mtc.find()) System.out.println("Ваш оператор \"МТС\"");
        else if (life.find()) System.out.println("Ваш оператор \"LIFE\"");
        else if (town.find()) System.out.println("Это городской телефон");
        else System.out.println("Неправильно введен номер");

    }
}