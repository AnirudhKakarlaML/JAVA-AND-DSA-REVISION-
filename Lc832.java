/*public class Lc832{
    int rows = image.length;
        int cols = image[0].length;
        int[][] result = new int[rows][cols];

        // Step 1: Traverse each row and column
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Flip horizontally by taking from the end of the row (cols - 1 - j)
                // and invert the value (0 becomes 1, 1 becomes 0)
                int originalVal = image[i][cols - 1 - j];
                result[i][j] = (originalVal == 0) ? 1 : 0;
            }
        }

        return result;
    }
}
    
}*/
