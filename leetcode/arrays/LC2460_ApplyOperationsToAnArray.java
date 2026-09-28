public class LC2460_ApplyOperationsToAnArray {
    class Solution {
    public int[] applyOperations(int[] nums) {

        // Phase 1: Apply operations on adjacent elements
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i]) {
                nums[i - 1] = nums[i - 1] * 2;
                nums[i] = 0;
            }
        }

        // Phase 2: Move all zeroes to the end
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }

        return nums;
    }
}
}
