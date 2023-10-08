package hometasks.lesson6.lvlB.task4;

import java.util.Scanner;

/*Напишите программу для определения оператора РБ по номеру телефона.
  Создать класс Run и в методе main проверить работу этой программы*/

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write down telephone number: ");
        String number = scanner.nextLine();
        if (number.strip().matches("^(\\+375|80)(17|25|29|33|44)(\\d{7})$")) {
            String opCode = number.substring(number.length() - 9, number.length() - 7);
            switch (opCode) {
                case "17":
                    System.out.println("Beltelecom");
                    break;
                case "25":
                    System.out.println("Life:)");
                    break;
                case "29":
                    //  с точки зрения чистоты написания кода, вот эту логику лучше вынести в отдельный метод.
                    //  представь, если на каждый case будет столько строк кода с логикой. читаемо будет?)
                    //  да, сейчас логика в каждом case проста и мала. но в будущем она может измениться. так вот лучше сразу показать хороший пример написания кода.
                    //  от
                    char firstDigit = number.charAt(number.length() - 7);
                    if (firstDigit == '1' || firstDigit == '3' || firstDigit == '6' || firstDigit == '9') {
                        System.out.println("A1");
                    } else if (firstDigit == '2' || firstDigit == '5' || firstDigit == '7' || firstDigit == '8') {
                        System.out.println("MTC");
                    } else {
                        System.out.println("Wrong number");
                    }
                    //  до
                    break;
                case "33":
                    System.out.println("MTC");
                    break;
                case "44":
                    System.out.println("A1");
                    break;
            }
        } else {
            System.out.println("Wrong number");
        }
    }
}
