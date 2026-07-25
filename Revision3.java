//MaxSubArraySum
/*public class s1{
    public static int MaxSubArraySum(int[]arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i ; j < arr .length ; j++){
                int currsum = 0;
                for(int k = i ; k<= j ; k++){
                    currsum+=arr[k];
                }
                if(currsum>max){
                    max = currsum;
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[]arr = {-1,2,3,-4,7,9};
        int x = MaxSubArraySum(arr);
        System.out.println(x);
    }
}*/

//Prefix Sum
/*public class s1{
    public static int PrefixSum(int[]arr){
        int n = arr.length;
        int [] prefix = new int[n];
        prefix[0] = arr[0];
        for(int i = 1 ; i < n ; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i++){
            for(int j = i ; j < arr.length ; j++){
                int currsum;
                
                if(i == 0){
                    currsum = prefix[j];
                }
                else{
                    currsum = prefix[j] - prefix[i-1];
                }
                if(currsum>max){
                    max = currsum;
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5};
        int x = PrefixSum(arr);
        System.out.println(x);
    }
}*/

//Prefix Sum
/*public class s1{
    public static int PrefixSum(int[]arr){
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for(int i = 1; i < arr.length ; i++){
            prefix[i] = prefix[i-1]+arr[i];
        }
        int max =Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i ; j < arr.length ; j++){
                int currsum;
                if(i == 0){
                    currsum = prefix[j];
                }
                else{
                    currsum = prefix[j] - prefix[i-1];
                }
                if(currsum> max){
                    max = currsum;

                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {-1, 2, 3, -4, 7, 9};
        System.out.println(PrefixSum(arr));
    }
}*/

//Kandanes Algorithm
/*public class s1{
    public static int KandanesAlgorithm(int[]nums){
        int currsum = 0 ;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < nums.length ; i++){
            currsum+=nums[i];
            if(max<currsum){
                max = currsum;
            }
            if(currsum < 0){
                currsum = 0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {-1, 2, 3, -4, 7, 9};
        System.out.println(KandanesAlgorithm(arr));
    }
}*/

