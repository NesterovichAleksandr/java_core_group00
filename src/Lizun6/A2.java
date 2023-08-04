package Lizun6;

public class A2 {
    public static void main(String[] args) {
        String house = "дом";
        System.out.println("Длина слова = " + house.length() + " символа");
        System.out.println("Верхний регистр слова = " + house + " это " + house.toUpperCase());

        String newWord = house.replace('д', 'с');

        System.out.println("Новое слово это " + "\"" +  newWord + "\"");
    }
}
