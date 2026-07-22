

/*public class s1 {
    public static void PrintSubarrays(int[]arr){
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i ; j < arr.length ; j++){
                for(int k = i; k<=j ; k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
                
            }
        }
    }
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6};
        PrintSubarrays(arr);
    }
}*/

//Maximum Continuos Subarray[BruteForce Approach]
/*public class s1{
    public static int MaximumContinuosSubarray(int[]arr){
        int maxsum = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i ; j < arr.length ; j++){
                int currsum = 0;
                for(int k = i ; k <= j ; k++){
                    currsum+=arr[k];
                }
                if(maxsum<currsum){
                    maxsum = currsum;
                }

            }
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6};
        System.out.println(MaximumContinuosSubarray(arr));
    }
}*/
