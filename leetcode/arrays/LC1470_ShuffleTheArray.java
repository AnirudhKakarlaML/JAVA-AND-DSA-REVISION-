class Solution {
    public int[] shuffle(int[] nums, int n) {
        int shuffled[] = new int[nums.length];
        int count = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(i%2!=0){
                shuffled[i] = nums[n];
                n++;
                
            }
            else{
                shuffled[i] = nums[count];
                count++;
                
            }
        }

        
       
        return shuffled;
    }
}