public class SecondLargest{
    public static void main(String[]args){
        int[]arr ={1,2,3,4,5};
        int MAX = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i]>MAX){
                MAX = arr[i];
            }
        }
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]<MAX && arr[i]>max2){
                max2 = arr[i];
            }
        }
        System.out.println(max2);
    }
}