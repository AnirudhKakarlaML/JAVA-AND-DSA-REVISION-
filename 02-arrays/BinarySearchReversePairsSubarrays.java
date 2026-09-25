//Binary Search , Reverse , Pairs , Subarrays
//Binary Search-->Hard Codes
/*public class s2{
    public static void main(String[] args) {
        int[]arr = {1 , 2 , 3  ,4 , 5};
        //Target 4
        int start = 0;
        int end = arr.length - 1;
        int key = 4;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == key ){
                System.out.println(mid);
                break;
            }
            else if(key > arr[mid]){
                start = mid+1;
            }
            else{
                end = mid - 1;
            }
        }
    }
}*/

//Reverse USing 2 Pointer Technique-->Revision[HArd Coded]
/*public class s2{
    public static void main(String[] args) {
        int[]arr = {1 , 2 , 3 , 4 , 5  };
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        for(int i = 0 ; i<arr.length ; i++){
            System.out.println(arr[i]);
        }
    }
}*/

//Pairs in Array
/*public class s2{
    public static void main(String[] args) {
        int[] arr = {1  ,2  ,3 , 4 , 5 , 6};
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i + 1 ; j < arr.length ; j++){
                System.out.print("(" +arr[i] +"," + arr[j]+ ")");
            }
            System.out.println();

        }
    }
}*/

//Subarrays
/*public class s2{
    public static void main(String[] args) {
        int[]arr = {1 , 2 , 3 , 4 , 5 , 6};
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i ; j < arr.length ; j++ ){
                for(int k = i ; k<=j ; k++){
                    System.out.print(arr[k]);
                }
                System.out.println();
            }
        }
    }
}*/
/*public class s2{
    public static void main(String[] args) {
        int[] arr = {1 , 1 , 2};
        int start = 0;
        for(int adj = 1 ; adj < arr.length ; adj++){
            if(arr[start] != arr[adj]){
                start++;
                arr[start] = arr[adj];
            }
        }
        int x = start + 1;
        for(int k = 0 ; k < x ; k++){
            System.out.println(arr[k]);
        }
        System.out.println(x);
    }
}*/

