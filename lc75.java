/*class Solution {
    public void sortColors(int[] nums) {
        for(int i = 0 ; i < nums.length - 1 ; i++){
            int minpos = i;
            for(int j = i+1 ; j < nums.length  ; j++){
                if(nums[minpos]>nums[j]){
                    minpos = j;
                }
            }
            int temp = nums[minpos];
            nums[minpos]=nums[i];
            nums[i]=temp;
        }
       
        
    }
}*/