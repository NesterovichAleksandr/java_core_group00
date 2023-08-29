package hometasks.classesandobjects.exercise2.levelC.one;

public class OldPerson extends Person {
    private int pensionSize;
    @Override
    public void walk() {
        super.walk();
        System.out.println("Walk slowly");
    }
    public void getPension(){
    }

    public int getPensionSize() {
        return pensionSize;
    }

    public void setPensionSize(int pensionSize) {
        this.pensionSize = pensionSize;
    }
}
