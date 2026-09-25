/*import java.util.*;
public class s1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] marks = new int[size];
        for(int i = 0 ; i<size ; i++){
            marks[i] = sc.nextInt();
        }
        for(int i = 0 ; i<size ; i++){
            System.out.println(marks[i]);
        }
        sc.close();
    }
}*/

//Arrays As Function Arguments
/*public class s1{
    public static void update(int[] arr){
        arr[0] = 999;
    }
    public static void main(String[] args) {
        int[]arr = {1 , 2 , 4};
        update(arr);
        System.out.println(arr[0]);
    }
}*/

//Linear Search
/*public class s1{
    public static void main(String[] args) {
        int[] arr = {1 , 2 , 4 , 5 , 6};
        int target = 6;
        int index = 0;
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i] == target){
                index = i;
            }
        }
        System.out.println(index);
    }
}*/

//Largest Element In An Array
/*public class s1{
    public static void main(String[] args) {
        int [] arr = {1 , 2 , 3 , 4 ,  5  , 6};
        int max = arr[0];
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}*/

//Binary Search
/*import java.util.*;
public class s1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] marks = new int[size];
        //Till Here We Fix  Size And Crea
        //Input
        for(int i = 0 ; i<marks.length ; i++){
            marks[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        //Start Binary Search
        int start = 0;
        int end = marks.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(marks[mid] == target){
                System.out.println(mid);
                break;
            }
            else if(target < marks[mid]){
                end = mid - 1;
            }
            else{
                start = mid+1;
            }
        }
sc.close();


    }
}*/

//Reversing An Array By Place Swap Technique
/*public class s1{
    public static void main(String[] args) {
        int [] arr = {1 , 2 , 3 , 4 , 5};
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

