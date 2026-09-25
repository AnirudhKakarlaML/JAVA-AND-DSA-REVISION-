/*public class InsertionSort {
    public static void selectionSort(int[]arr){
        for(int i = 0 ; i < arr.length-1 ; i++){
            int minidx = i;
            for(int j = i+1 ; j < arr.length ; j++){
                
                if(arr[j] < arr[minidx]){
                    minidx = j;

                }
                
            }
            int temp = arr[i];
            arr[i] = arr[minidx];
            arr[minidx] = temp;
            

            
        }
        for(int i = 0 ; i < arr.length ; i++){
            System.out.println(arr[i]);
        }

    }
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        selectionSort(arr);
    }
    
}*/

//Insertion Sort Write Code Herea And Dry Run On Ipad
/*public class InsertionSort{
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1};
        for(int i = 1 ; i < arr. length; i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}*/
