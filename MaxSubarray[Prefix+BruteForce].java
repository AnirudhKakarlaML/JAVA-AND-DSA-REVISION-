//LC26
/*public class s2{
    public static int RemoveDuplicates(int[]nums){
        int i = 0;
        for(int j = 1 ; j < nums.length ; j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int[]nums = {1 ,1 , 2 , 2 , 3 , 3 , 4 , 4};
        System.out.println(RemoveDuplicates(nums));
    }
}*/

//Lectures And Their Code
//MAx Subarray Sum
/*public class s2{
     public static int Maxsum(int[] nums){
        int maximum = Integer.MIN_VALUE;
        for(int i = 0 ; i <nums.length ; i++){
            for(int j = i ; j < nums.length ; j++){
                int currsum = 0;
                for(int k = i ; k  <=j ; k++){
                    currsum+=nums[k];
                }
                if(maximum<currsum){
                    maximum = currsum;
                }
                
            
            }
        }
        return maximum;
     }
     public static void main(String[] args) {
        int[]nums = {1 , 2 , 4 ,5 ,6};
        System.out.println(Maxsum(nums));
        
     }
}*/

//Prefix Sum
/*public class s2{
    public static int PrefixSum(int[]nums){
        int currsum = 0;
        int max = Integer.MIN_VALUE;
        int [] prefix = new int[nums.length];
        prefix[0] = nums[0];
        for(int i = 1 ; i < prefix.length ; i++){
            prefix[i] = prefix[i - 1] +nums[i];
        }
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = i ; j <nums.length ; j++){
                if(i == 0){
                    currsum = prefix[j];

                }
                else{
                    currsum = prefix[j]-prefix[i - 1];
                }
            }
            if(max < currsum){
                max = currsum;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};

        System.out.println(PrefixSum(nums));
    }
}*/

//prefix sum
/*public class s2{
    public static int PrefixSum(int[] nums){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
       
        int[]prefix = new int[nums.length];
         prefix[0] = nums[0];
        for(int i = 1 ; i < prefix.length ; i++){
            prefix[i] = prefix[i - 1]+nums[i];
        }
        for(int i = 0 ; i < nums.length ; i ++){
            for(int j = i ; j < nums.length ; j ++){
                if(i == 0 ){
                    currsum = prefix[j];
                }
                else{
                    currsum = prefix[j] - prefix[i - 1];
                }
            }
            if(maxsum < currsum){
                maxsum = currsum;
            }
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};

        System.out.println(PrefixSum(nums));
    }
}*/

