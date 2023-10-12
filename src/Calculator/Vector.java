package Calculator;

public class Vector extends Var {
    double[] value;
    Vector vector;
    String strVector;

    public Vector(double[] value) {
        this.value = value;
    }

    public Vector(Vector vector) {
        this.vector = vector;
    }

    public Vector(String strVector) {
        this.strVector = strVector;
    }

    public String toString() {
        return "Вектор это " + value + " ; " + vector + " ; " + strVector;

    }

    @Override
    public void addition() {

    }

    @Override
    public void subtraction() {

    }

    @Override
    public void multiplication() {

    }

    @Override
    public void division() {

    }
}
