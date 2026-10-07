class Solution {
    public boolean halvesAreAlike(String s) {
        String S = s.toLowerCase();
        int count1 = 0 ;
        int count2 = 0;
        for(int i = 0 ; i < S.length()/2 ; i++){
            if(S.charAt(i) == 'a' || S.charAt(i) == 'e' || S.charAt(i) == 'o' ||S.charAt(i) =='i'|| S.charAt(i) == 'u'){
                count1++;
            }
        }
        for(int i = S.length()/2 ; i < S.length(); i++){
            if(S.charAt(i) == 'a' || S.charAt(i) == 'e' || S.charAt(i) == 'o' ||S.charAt(i) =='i'|| S.charAt(i) == 'u'){
                count2++;
            }
        }
        return count1==count2;
    }
}
