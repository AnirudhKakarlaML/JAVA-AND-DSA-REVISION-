public class LC2643_RowWithMaximumOnes {
    public static void main(String[] args) {
        int arr[][]={{1,0,0} ,{1,0,1} ,{1,1,1} };
        int mat[]= new int[2];
        int rowindex = 0;
        int count =0;
        for(int i = 0 ; i < arr.length ; i++){
            int count_1 = 0;
            for(int j = 0 ; j<arr[0].length ; j++){
                if(arr[i][j]==1){
                    count_1+=1;
                }

            }
            if(count_1>count){
                    count = count_1;
                    rowindex = i;
                }
            
        }
        System.out.println(rowindex);
        System.out.println(count);
    
    }
    
}
