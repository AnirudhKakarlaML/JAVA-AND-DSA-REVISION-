public class LC1816_TruncateSentence {
    class Solution {
    public String truncateSentence(String s, int k) {
        String output="";
        String[]words = s.split(" ");
        for(int i = 0 ; i < k ; i ++){
            if(i < k-1){
                output+=words[i]+" ";

            }
            else{
                output+=words[i];
            }
        }
        return output;
        
        
    }
}
}
