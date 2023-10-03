package Lizun9;

public class Run {
    public static void main(String[] args) {
        Container<String> container = new Container<>();
        Container<Integer> container2 = new Container<>();

        container.setContent("Java");
        container2.setContent(123456);

        System.out.println(container.getContent());
        System.out.println(container2.getContent());
    }
}
