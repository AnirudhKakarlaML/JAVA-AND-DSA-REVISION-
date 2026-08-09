/*public class selectionsort{
    public static void selectionsort(int[]nums){
        for(int i = 0 ; i < nums.length - 1 ;i++){
            int minpos = i ;
            for(int j = i + 1 ; j < nums.length - 1 ; j++){
                if(nums[minpos]>nums[j]){
                    minpos = j ;
                }
            }
            int temp = nums[minpos];
            nums[minpos] = nums[i];
            nums[i] = temp;
        }
        for(int i = 0 ; i < nums.length ; i++){
            System.out.println(nums[i]);
        }
    }
    public static void main(String[] args) {
        int[]arr = {5,4,1,2,3};
        selectionsort(arr);

    }
}*/
