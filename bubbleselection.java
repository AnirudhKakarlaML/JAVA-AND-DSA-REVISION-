public class bubbleselection {
    public static void bubblesort(int[]nums){
        int n = nums.length;
        for(int i = 0 ; i < n - 1 ; i++){
            for(int j = 0 ; j < n -1 -i ; j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1]=temp;

                }
            }
        }
        for(int i = 0 ; i < n ; i++){
            System.out.println(nums[i]);
        }
    }
    public static void selectionsort(int[]nums){
        int n = nums.length;
        for(int i =0 ; i<n-1;i++){
            int minpos =i;
            for(int j = i+1;j<n-1;j++){
                if(nums[minpos]>nums[j]){
                    minpos = j;
                }
            }
            int temp = nums[minpos];
            nums[minpos]=nums[i];
            nums[i]=temp;
        }
        for(int i = 0 ; i < nums.length ; i++){
            System.out.println(nums[i]);
        }
    }
    public static void main(String[] args) {
        int[]arr = {5,4,3,2,1};
        bubblesort(arr);
        selectionsort(arr);

    }
    
}
