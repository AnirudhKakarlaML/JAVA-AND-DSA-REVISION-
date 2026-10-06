public class LC2000_ReversePrefixOfWord {
    class Solution {
    public String reversePrefix(String word, char ch) {
        int index=-1;
        for(int i = 0 ; i < word.length() ; i++){
            if(word.charAt(i) == ch){
                index=i;
                break;
            }
        }
        String arr[] = word.split("");
        int start = 0;
        int end = index;
        while(start <  end){
            String temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        String output = "";
        for(int i = 0 ; i < arr.length ; i++){
            output+=arr[i];
        }
        return output;
    }
}
}
