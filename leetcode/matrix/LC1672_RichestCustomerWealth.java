public class LC1672_RichestCustomerWealth {
    class Solution {
    public int maximumWealth(int[][] accounts) {
        int wealth = 0;
        int m = accounts.length;
        int n = accounts[0].length;
        for(int i = 0 ; i < m ; i++){
            int currsum = 0;
            for(int j = 0 ; j < n ; j++){
                
                currsum+=accounts[i][j];
                
            }
            if(currsum>wealth){
                wealth = currsum;
            }
            
        }
        return wealth;
    }
}
}
