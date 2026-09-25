public class DiagonalSum {

    public static int sumDiagonal(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;
        int sum = 0;

        for(int i = 0; i < rows; i++) {

            for(int j = 0; j < cols; j++) {

                // Primary diagonal
                if(i == j) {
                    sum += matrix[i][j];
                }

                // Secondary diagonal
                else if(i + j == matrix.length - 1) {
                    sum += matrix[i][j];
                }
            }
        }

        return sum;
    }

    public static int sumDiagonal_optimised(int[][] matrix) {

        int sum = 0;

        for(int i = 0; i < matrix.length; i++) {

            // Primary diagonal
            sum += matrix[i][i];

            // Secondary diagonal
            if(i != matrix.length - 1 - i) {
                sum += matrix[i][matrix.length - 1 - i];
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println(sumDiagonal(matrix));
        System.out.println(sumDiagonal_optimised(matrix));
    }
}