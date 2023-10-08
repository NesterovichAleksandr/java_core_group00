package Lizun9.A1;

public class Run {
    public static void main(String[] args) {
        Container<Object> container = new Container<>();
        Container<Object> container2 = new Container<>();

        container.setContent("Java");
        container2.setContent(123456);

        System.out.println(container.getContent());
        System.out.println(container2.getContent());
    }
}
