package hometasks.velimovich.les6.a2;

public class a2 {

    public static void main(String[] args) {
        String str = "дом";
        System.out.println ("Изначальное слово: " + str);
        System.out.println ("Длина слова: " + str.length());
        String result = str.toUpperCase();
        System.out.println ("Результат: " + result);
        System.out.print ("Второй результат: ");
        System.out.println(result.replace('М', 'К'));
    }
}
