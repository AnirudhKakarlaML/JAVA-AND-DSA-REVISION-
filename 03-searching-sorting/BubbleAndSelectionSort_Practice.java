/*public class BubbleAndSelectionSort_Practice {
    public static void bubblesort(int[]arr){
        for(int i = 0 ; i < arr.length - 1 ; i++){
            for(int j = 0 ; j < arr.length - 1 - i ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
            
        }
        for(int i = 0 ; i < arr.length ; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[]arr = {5,4,3,2,1};
        bubblesort(arr);
    }
}*/
/*public class BubbleAndSelectionSort_Practice{
    public static void selectionSort(int[]arr){
        for(int i = 0 ; i< arr.length - 1 ; i++){
            int minpos = i;
            for(int j = i+1 ; j < arr.length  ; j++){
                if(arr[minpos]>arr[j]){
                    minpos = j;
                }
            }
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            
        }
    }
    public static void main(String[] args) {
        int[]arr = {5,4,3,2,1};
        selectionSort(arr);
    }
}*/
