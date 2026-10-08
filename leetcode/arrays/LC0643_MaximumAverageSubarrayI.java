public class LC0643_MaximumAverageSubarrayI {
    class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double average = 0;
        int l = 0 ;
        int r = k-1;
        int sum = 0;
        for(int i = 0 ; i < k ; i++){
            sum+=nums[i];
        }
        average = sum/(double)k;
        double maxavg = average;
        while(r < nums.length - 1){
            sum = sum - nums[l];
            l++;
            r++;
            sum = sum + nums[r];
            average = sum/(double)k;
            maxavg = Math.max(average , maxavg);
        }
        return maxavg;
    }
}
}