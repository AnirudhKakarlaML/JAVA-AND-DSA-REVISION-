/*public class r2 {
    public static void Subarray(int[]arr){
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i; j < arr.length ; j++){
                for(int k = i ; k <=j ; k++){
                    System.out.print(arr[k] + " "  );

                }
                System.out.println();
            }
        }//Printing Subarrays
    }
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5};
        Subarray(arr);
    }
}*/

//MAXSUBARRAYSUM[BRUTEFORCE]
/*public class r2{
    public static void maxSubArraySum(int[]arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            
            for(int j = i ; j < arr.length ; j++){
                int currsum = 0;
                for(int k = i ; k<=j ; k++){
                    currsum += arr[k];
                }
                
                if(currsum > max){
                    max = currsum;
                }
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5};
        maxSubArraySum(arr);
    }
}*/

//Maxsubarraysum better time complexity o(n^2) + prefix sum + kadaenes algorithm
/*public class r2{
    //Time Complexity o(n^2)
    public static void maxSubarray(int[]arr){
        int max = Integer.MIN_VALUE;
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            prefix[i] = arr[i] + prefix[i-1];
        }
        for(int i = 0 ; i < arr.length ; i++){
            
            for(int j = 0 ; j < arr.length ; j++){
                int sum = 0 ;
                
                if(i == 0){
                    sum = prefix[j];
                }
                else{
                    sum = prefix[j] - prefix[i-1];
                }
               if(sum > max){
                max=sum;
               }
            }
            

            
            
        }
        System.out.println(max);

    }
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5};
        maxSubarray(arr);
    }
}*/

//kadaenes Algorithm
/*public class r2{
    public static void kadaenes(int[]arr){
        int currsum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            currsum+=arr[i];
            if(currsum>max){
                max = currsum;
            }
            if(currsum<0){
                currsum = 0;
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int[]arr = {-1,-5 ,2, 4};
        kadaenes(arr);
        for(int i = 0 ; i < arr.length ; i++){
            System.out.println(arr[arr[i]]);
        }

    }
}*/

//Bubble Sort Java
/*public class r2{
    public static void BubbleSort(int[]arr){
        for(int i = 0 ; i < arr.length - 1 ; i++){
            for(int j = 0 ; j < arr.length - 1 - i ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                
            }
        }
        for (int idx = 0; idx < arr.length; idx++) {
                    System.out.println(arr[idx] + " ");
                    
                }
    }
    public static void main(String[] args) {
        int arr[] = {-2,-3,4,1,2};
        BubbleSort(arr);
    }
}*/

//Selection Sort
//BAsic Idea Is We Find The Minimum Element And Place It At First
//Put Minimum At First
