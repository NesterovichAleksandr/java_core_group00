package hometasks.velimovich.les6.a2;

public class a2 {

    public static void main(String[] args) {
        String str = "дом";
        String result = str.toUpperCase();
        System.out.println ("Result: " + result);
        System.out.print ("Second result: ");
        System.out.println(result.replace('М', 'К'));
    }
}
