package Lizun9.В1;

public class Run {
    public static void main(String[] args) {
        Array myMassive = new Array();
        myMassive.setElement(78);
        myMassive.setElement("5");
        myMassive.setElement(6);
        myMassive.setElement("125");
        myMassive.setElement(25);
        myMassive.setElement(453);
        myMassive.setElement(1);
        myMassive.setElement(49);
        myMassive.setElement(1058);
        myMassive.setElement(259);
        myMassive.setElement(111111);

        myMassive.printArray();

        myMassive.getElement(2);

        myMassive.contains(259);

        myMassive.getIndex(1058);

        myMassive.delete(2);

        Integer man = 49;
        myMassive.delete(man);
    }
}
