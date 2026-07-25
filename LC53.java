/*public class LC53 {
    class Solution {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int currsum = 0;
        for(int i = 0 ; i < nums.length ; i++){
            currsum+=nums[i];
            if(max < currsum){
                max = currsum;
            }
            if(currsum < 0){
                currsum = 0;
            }
        }
        return max;
        
    }
}
    
}*/


