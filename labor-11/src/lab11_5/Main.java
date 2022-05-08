package lab11_5;

public class Main {
    public static void main(String[] args) throws MatrixException{
        double[][] data = { { 17, 5, 2 }, { 10, 3, 7 }};
        Matrix matrix1 = new Matrix(data);
        System.out.println("Sorok: " + matrix1.getRows()+", oszlopok:  " + matrix1.getColumns());
        System.out.println("Matrix1: ");
        matrix1.printMatrix();
        System.out.println();
        Matrix matrix2 = new Matrix( matrix1 );
        matrix2.printMatrix();
        Matrix m1 = new Matrix(3, 4);
        m1.fillRandom(1,4);
        System.out.println("m1: ");
        m1.printMatrix();
        Matrix m2 = Matrix.add(matrix1,m1);
        System.out.println("m2 matrix:");
        m2.printMatrix();
        Matrix m3 = Matrix.multiply(matrix1,m1);
        System.out.println("m3 matrix:");
        m3.printMatrix();
    }
}
