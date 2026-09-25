public class LC2022_Convert1DArrayInto2DArray {
    class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int el = m*n;
        int arr[][] = new int[m][n];
        int num=0;
       for(int i = 0 ; i < m ; i++){
        for(int j = 0 ; j < n ; j++){
            if(el==original.length){
                arr[i][j] = original[num++];
            }
            else{
                return new int[0][0];
            }


        }
       
       }
       return arr;
    }
}
}
