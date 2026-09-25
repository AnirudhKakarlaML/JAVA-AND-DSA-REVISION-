//Second Largest Element
/*public class s2{
    public static void main(String[] args) {
        int[] arr = {1 , 2 , 3 , 4 , 5};
        int max = arr[0];
        int second = arr[0];
        for(int i = 0 ; i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i] > second && arr[i] < max){
                second = arr[i];
            }
        }
        System.out.println("First Max Element Is " + max+ " the Second Max Is " +second);
    }
}*/

//Checking Whether The The Array Is Sorted
/*public class s2{
    public static void main(String[] args) {
        int [] arr = {1 , 2 , 3 ,4 ,5};
        boolean Sorted = true;
        for(int i = 0 ; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                Sorted = false;
                break;
            }
           
        }
        if(Sorted == true){
            System.out.println("Sorted");
        }
        else{
            System.out.println("Not Sorted");
        }
    }
}*/
        