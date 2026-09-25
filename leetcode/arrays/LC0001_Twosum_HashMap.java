import java.util.HashMap;

public class LC0001_Twosum_HashMap {
    // Approach: for each number, check if (target - number) was already seen.
    // Time: O(n)   Space: O(n)
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> seen = new HashMap<>(); // number -> index
        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if (seen.containsKey(need)) {
                return new int[]{seen.get(need), i};
            }
            seen.put(nums[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int[] ans = twoSum(nums, 9);
        System.out.println(ans[0] + " " + ans[1]); // 0 1
    }
}