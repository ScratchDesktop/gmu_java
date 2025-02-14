package lab_2;

public class Matrix {
        public static void main(String[] args) {
            double[][] arr = {
                {1.0, 2.0, 3.0},
                {4.0, 5.0, 6.0},
                {7.0, 8.0, 9.0}
            };
    
            printValues(arr);
            double[][] newArr = transposeCopy(arr);
            printValues(newArr);
            transposeInPlace(arr);
            printValues(arr);
        }
    
        public static void printValues(double[][] arrayOfArrays) {
            for (int i = 0; i < arrayOfArrays.length; i++) {
                for (int j = 0; j < arrayOfArrays[i].length; j++) {
                    System.out.print(arrayOfArrays[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    
        public static double[][] transposeCopy(double[][] matrix) {
            int rows = matrix.length;
            int cols = matrix[0].length;
            double[][] outArr = new double[cols][rows];
    
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    outArr[j][i] = matrix[i][j];
                }
            }
            return outArr;
        }
    
        public static void transposeInPlace(double[][] matrix) {
            int n = matrix.length;
            if (n != matrix[0].length) {
                throw new IllegalArgumentException("In-place transpose is only possible for square matrices.");
            }
    
            double tmp;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    tmp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = tmp;
                }
            }
        }
    }

