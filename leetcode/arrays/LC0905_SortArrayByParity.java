/*public class LC0905_SortArrayByParity {
    class Solution {
    public int[] sortArrayByParity(int[] arr) {
        
        int j = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] % 2 == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return arr;
    }
}
    
}*/
