package core_java_practice.core_java_practice.gcr_codebase.methods.Level3;

public class MatrixAdvanced {

    public static double[][] transpose(double[][] matrix) {

        double[][] result =
                new double[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[0].length; j++) {

                result[j][i] = matrix[i][j];
            }
        }

        return result;
    }

    public static double determinant2x2(double[][] matrix) {

        return matrix[0][0] * matrix[1][1]
                - matrix[0][1] * matrix[1][0];
    }

    public static double determinant3x3(double[][] m) {

        return m[0][0] * (m[1][1] * m[2][2]
                - m[1][2] * m[2][1])

                - m[0][1] * (m[1][0] * m[2][2]
                - m[1][2] * m[2][0])

                + m[0][2] * (m[1][0] * m[2][1]
                - m[1][1] * m[2][0]);
    }

    public static double[][] inverse2x2(double[][] m) {

        double det = determinant2x2(m);

        double[][] inv = new double[2][2];

        inv[0][0] = m[1][1] / det;
        inv[0][1] = -m[0][1] / det;
        inv[1][0] = -m[1][0] / det;
        inv[1][1] = m[0][0] / det;

        return inv;
    }

    public static void display(double[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[0].length; j++) {

                System.out.printf("%.2f\t", matrix[i][j]);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        double[][] matrix = {
                {1, 2},
                {3, 4}
        };

        System.out.println("Transpose:");
        display(transpose(matrix));

        System.out.println("\nDeterminant:");
        System.out.println(determinant2x2(matrix));

        System.out.println("\nInverse:");
        display(inverse2x2(matrix));
    }
}