/*public class LC0059_SpiralMatrixII {
    class Solution {
    public int[][] generateMatrix(int n) {
        int matrix[][] = new int[n][n];
        int rows = matrix.length;
        int cols = matrix[0].length;
        int num = 1;
        int top = 0; int bottom = rows-1; int left = 0;int right = cols-1;
        while(left<=right && top<=bottom){
            for(int i = left ; i <= right ; i++){//Left To Right Traverse
                matrix[top][i] = num++;
            }
            top++;
            //Top To Bottom
            for(int i = top ; i<=bottom ; i++){
                matrix[i][right]=num++;
            }
            right--;
            if(top<=bottom){
                //Right to Left
                for(int i = right ; i>=left ; i--){
                    matrix[bottom][i] = num++;
                }
                bottom--;
            }
            if(left<=right){
                for(int i = bottom ; i >= top ; i--){
                    matrix[i][left] = num++;
                }
                left++;
            }
        }
        return matrix;

    }
}
}*/

