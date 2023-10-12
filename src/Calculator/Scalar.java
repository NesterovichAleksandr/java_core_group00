package Calculator;

public class Scalar extends Var {
    double value;
    Scalar scalar;
    String strScalar;

    public Scalar(double value) {
        this.value = value;
    }

    public Scalar(Scalar scalar) {
        this.scalar = scalar;
    }

    public Scalar(String strScalar) {
        this.strScalar = strScalar;
    }

    public String toString() {
        return "Скаляр это " + value + " ; " + scalar + " ; " + strScalar;
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
