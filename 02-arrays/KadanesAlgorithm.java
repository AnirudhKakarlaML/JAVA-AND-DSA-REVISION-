

/*public class KadanesAlgorithm {
    public static int KadanesAlgorithm(int[]arr){
        int cs = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i <arr.length ; i++){
            cs+=arr[i];
            if(max<cs){
                max=cs;
            }
            if(cs<0){
                cs=0;
            }
        }
        return max;

    }
    public static void main(String[] args) {
        int[]arr = {1,2,3};
        System.out.println(KadanesAlgorithm(arr));
    }
}*/
