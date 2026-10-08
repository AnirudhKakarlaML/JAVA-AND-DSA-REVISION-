public class SlidingWindow_LeftRightPointers {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,6,7,8,9};
        int k = 3;
        int sum = 0;
        for(int i = 0 ; i < k ; i++){
            sum+=arr[i];
        }
        int maxsum = 0;
        int l = 0;
        int r =k-1;
        while(r<arr.length-1){
            sum = sum-arr[l];
            l++;
            r++;
            sum = sum+arr[r];
            if(maxsum<sum){
                maxsum = sum;

            }
        }
        System.out.println(maxsum);

    
    }
}
