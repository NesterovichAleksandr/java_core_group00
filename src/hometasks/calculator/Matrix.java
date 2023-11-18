package hometasks.calculator;

public class Matrix extends Var implements Operation {

    private double[][] matrixValue;
    public Matrix(double[][] value) {
        this.matrixValue = value;
    }

    public Matrix(Matrix matrix) {
        this.matrixValue = matrix.matrixValue;
    }

    public Matrix(String strMatrix) {
        strToMatrix(strMatrix);
    }

    public double[][] strToMatrix(String strVector) {
//        String[] vectors = strVector.substring(2, strVector.length() - 2/*3*/).split("\\}\\,\\s\\{");
//        String[] vector = vectors[0].split("\\,\\s");
//        return Arrays.stream(vectors).mapToDouble(s -> Arrays.stream(s.split("\\,\\s")).mapToDouble(Double::parseDouble).toArray()).toArray();
    }
}
