package Calculator;

public class Matrix extends Var {
    double[][] value;
    Matrix matrix;
    String strMatrix;

    public Matrix(double[][] value) {
        this.value = value;
    }

    public Matrix(Matrix matrix) {
        this.matrix = matrix;
    }

    public Matrix(String strMatrix) {
        this.strMatrix = strMatrix;
    }

    public String toString() {
        return "Матрица это " + value + " ; " + matrix + " ; " + strMatrix;
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
