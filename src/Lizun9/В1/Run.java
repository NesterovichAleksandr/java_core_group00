package Lizun9.В1;

public class Run {
    public static void main(String[] args) {
        Array myMassive = new Array();

        myMassive.setElement(78);
        myMassive.setElement(8);
        myMassive.setElement(6);
        myMassive.setElement(10);
        myMassive.setElement(25);
        myMassive.setElement(453);
        myMassive.setElement(1);
        myMassive.setElement(49);
        myMassive.setElement(1058);
        myMassive.setElement(259);

        myMassive.getElement(0);
        myMassive.getElement(2);

        myMassive.contains(78);
        myMassive.contains(6);

        myMassive.getIndex(10);
        myMassive.getIndex(8);

        myMassive.printArray();
    }
}
