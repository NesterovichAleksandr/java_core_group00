package hometasks.classesandobjects.exercise2.c1;

public class OldPerson extends Person {
    private int pensionSize;

    @Override
    public void walk() {
        super.walk(); // эта строчка не обязательна.
        System.out.println("Walk slowly");
    }

    public void getPension() {
    }

    public int getPensionSize() {
        return pensionSize;
    }

    public void setPensionSize(int pensionSize) {
        this.pensionSize = pensionSize;
    }
}
