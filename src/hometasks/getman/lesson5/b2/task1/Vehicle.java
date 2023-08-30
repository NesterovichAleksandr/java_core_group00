package hometasks.getman.lesson5.b2.task1;

/*1.	Создайте класс Vehicle (транспортное средство). Добавьте в него поля view (вид),
speed (скорость). Добавьте еще минимум 3 поля с точки зрения пассажира.
 Создайте 3 класса наследника для Vehicle. В классах наследниках реализуйте метод move().
 */

public class Vehicle {
    private static String view;
    private double speed;
    private double noiseLevel;
    private String comfortLevel;
    private int safetyLevel;

    public static String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }


}
