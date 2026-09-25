/*public class s2{
    public static int PrefixSum(int[]nums){
        int currsum =0;
        int maximum =Integer.MIN_VALUE;
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        for(int i = 1; i < prefix.length ; i++){
            prefix[i] = prefix[i - 1] + nums[i];
        }
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = 0 ; j < nums.length ; j++){
                if(i == 0){
                    currsum = prefix[j];
                }
                else{
                    currsum = prefix[j] - prefix[i - 1];
                }
            }
            if(maximum < currsum ){
                maximum = currsum;
            }
        }
        return maximum;
    }
    public static void main(String[] args) {
        int[] arr = {1 , 2 , 3 , 4 , 5};
        System.out.println(PrefixSum(arr));
    }
}*/