public class LC1929_ConcatenationOfArray {
    class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int mixed[] = new int[2*nums.length];
        for(int i = 0 ; i < nums.length ; i++){
            mixed[i] = nums[i];
        }
        for(int i = 0 ; i < nums.length ; i++){
            mixed[i+n] = nums[i];
        }
        return mixed;
    }
}
}
