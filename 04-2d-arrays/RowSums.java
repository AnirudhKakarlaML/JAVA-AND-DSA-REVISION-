import java.util.*;

public class RowSums{
    public static void main(String[] args) {
        int matrix[][] = {{1,2}, {2,4}};
        List <Integer> list = new ArrayList<>();
        for(int i = 0 ; i <matrix.length ; i++){
            int sum = 0;
            for(int j = 0 ; j<matrix[0].length; j++){
                sum+=matrix[i][j];
                
            }
            list.add(sum);
        }
        System.out.println(list);
    }
}