public class SlidingWindow_LongestSubarraySumAtMostK {
    public static void main(String[] args) {
        int[]arr = {2,12,3,4,5,67,4};
        int k = 71;
        int sum = 0;
        int r = 0;
        int l = 0;
        int maxlength = 0;
        while(r < arr.length){
            sum = sum+arr[r];
            while(sum > k){
                sum = sum - arr[l];
                l++;
            }
            if(sum <= k ){
                maxlength = Math.max(maxlength , r-l+1);
            }
            r++;
        }
        System.out.println(maxlength);
    }
}
