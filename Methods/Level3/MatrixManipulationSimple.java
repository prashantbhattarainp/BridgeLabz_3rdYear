import java.util.Random;

public class MatrixManipulationSimple {

    public static void main(String[] args) {
        // Generate 2x2 and 3x3 random matrices
        int[][] matrix2x2 = generateMatrix(2, 2);
        int[][] matrix3x3 = generateMatrix(3, 3);

        System.out.println("Original 2x2 Matrix:");
        displayMatrix(matrix2x2);

        System.out.println("\nTranspose of 2x2 Matrix:");
        displayMatrix(transpose(matrix2x2));

        int det2 = determinant2x2(matrix2x2);
        System.out.println("\nDeterminant of 2x2 Matrix: " + det2);

        if (det2 != 0) {
            System.out.println("Inverse of 2x2 Matrix:");
            double[][] inv2 = inverse2x2(matrix2x2);
            displayMatrix(inv2);
        } else {
            System.out.println("Inverse does not exist (Determinant = 0)");
        }

        System.out.println("\n\n");

        System.out.println("Original 3x3 Matrix:");
        displayMatrix(matrix3x3);

        System.out.println("\nTranspose of 3x3 Matrix:");
        displayMatrix(transpose(matrix3x3));

        int det3 = determinant3x3(matrix3x3);
        System.out.println("\nDeterminant of 3x3 Matrix: " + det3);

        if (det3 != 0) {
            System.out.println("Inverse of 3x3 Matrix:");
            double[][] inv3 = inverse3x3(matrix3x3);
            displayMatrix(inv3);
        } else {
            System.out.println("Inverse does not exist (Determinant = 0)");
        }
    }

    // Generate random matrix
    public static int[][] generateMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); // values 0–9
            }
        }
        return matrix;
    }

    // Transpose
    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] trans = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                trans[j][i] = matrix[i][j];
            }
        }
        return trans;
    }

    // Determinant 2x2
    public static int determinant2x2(int[][] m) {
        return (m[0][0] * m[1][1]) - (m[0][1] * m[1][0]);
    }

    // Determinant 3x3
    public static int determinant3x3(int[][] m) {
        return (m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1]))
             - (m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0]))
             + (m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]));
    }

    // Inverse 2x2
    public static double[][] inverse2x2(int[][] m) {
        int det = determinant2x2(m);
        double[][] inv = new double[2][2];
        inv[0][0] =  m[1][1] / (double)det;
        inv[0][1] = -m[0][1] / (double)det;
        inv[1][0] = -m[1][0] / (double)det;
        inv[1][1] =  m[0][0] / (double)det;
        return inv;
    }

    // Inverse 3x3
    public static double[][] inverse3x3(int[][] m) {
        int det = determinant3x3(m);
        double[][] inv = new double[3][3];

        inv[0][0] =  (m[1][1] * m[2][2] - m[1][2] * m[2][1]);
        inv[0][1] = -(m[1][0] * m[2][2] - m[1][2] * m[2][0]);
        inv[0][2] =  (m[1][0] * m[2][1] - m[1][1] * m[2][0]);

        inv[1][0] = -(m[0][1] * m[2][2] - m[0][2] * m[2][1]);
        inv[1][1] =  (m[0][0] * m[2][2] - m[0][2] * m[2][0]);
        inv[1][2] = -(m[0][0] * m[2][1] - m[0][1] * m[2][0]);

        inv[2][0] =  (m[0][1] * m[1][2] - m[0][2] * m[1][1]);
        inv[2][1] = -(m[0][0] * m[1][2] - m[0][2] * m[1][0]);
        inv[2][2] =  (m[0][0] * m[1][1] - m[0][1] * m[1][0]);

        double[][] result = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = inv[j][i] / (double)det;
            }
        }
        return result;
    }

    // Display int matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    // Display double matrix
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
