/*public class s1{
    public static int LinearSearch(int[]arr , int target){
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == target){
                return i;//Returns Index Position
            }

        }
        return -1;
    }
    
    public static void main(String[] args) {
        int[] max = {1 , 2 , 3 , 4 ,5};
        int target = 4;
        int x = LinearSearch(max, target);
        System.out.println(x);
    
        
    }
}*/

/*public class s1{
    public static int Largest(int[]arr){
        int max = arr[0];
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[]args){
        int [] arr = {1, 2 , 3 , 4 , 5};
        int max = Largest(arr);
        System.out.println(max);


        
    }
}*/

/*public class s1{//Binary Search
    public static int BinarySearch(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                start = mid+1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[]arr = { 1 , 2 , 3 , 4 , 5};
        int target = 1;
        int x = BinarySearch(arr, target);
        System.out.println(x);
    }
}*/

//Reversing An Array Using Two Pointers
/*public class s1{
    public static void TwoPointerReverse(int[]arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for(int i = 0 ; i < arr.length ; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[]arr = {1 , 2 , 3 , 4 ,5 };
        TwoPointerReverse(arr);
    }
}*/

/*public class s1{
    public static void Pairs(int[]arr){
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i + 1 ; j < arr.length ; j++){
                System.out.println(arr[i]+","+arr[j]);
            }
        }
    }
    public static void main(String[] args) {
        int[]arr = {1 , 2 , 3 , 4 , 5};
        Pairs(arr);
    }
}*/