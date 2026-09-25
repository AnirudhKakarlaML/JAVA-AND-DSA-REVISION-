

/*public class Revision02_ReverseAndPairs {
    public static void maximumElement(int[]arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0 ;  i < arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        maximumElement(arr);
    }
    
}*/

/*public class Revision02_ReverseAndPairs{
    public static void minimumElement(int[]arr){
        int min = Integer.MAX_VALUE;
        for(int  i = 0 ; i < arr.length ; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min);
    

    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        minimumElement(arr);
        
    }
}*/

/*public class Revision02_ReverseAndPairs{
    public static int linearSearch(int[]arr , int key){
        int idx = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == key){
                idx = i;
                break;
            }
            
            
        }
        return idx;
        
        
        
    }
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5};
        int key = 4;
        System.out.println(linearSearch(arr, key));
    }
    
}*/

//Reversing An Array Two Pointer Techniques
/*public class Revision02_ReverseAndPairs{
    public static void reverseArray(int[]arr){
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        for(int i = 0 ; i < arr.length ; i++){
            System.out.println(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        reverseArray(arr);
    }
}*/

//Pairs In An Array
/*public class Revision02_ReverseAndPairs{
    public static void pairsArray(int[]arr){
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i + 1  ; j < arr.length ; j++){
                System.out.println(arr[i] + " " + arr[j]);
            }
        }
    }
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5};
        pairsArray(arr);
    }
}*/



