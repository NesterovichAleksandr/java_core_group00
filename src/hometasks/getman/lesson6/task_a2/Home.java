package hometasks.getman.lesson6.task_a2;

public class Home {
    public static void main(String[] args) {
        String home="дом";
        System.out.println("Word length = "+home.length());
        home=home.toUpperCase();
        String clod=home.replace("Д","К");
        System.out.println(clod);
    }
}
