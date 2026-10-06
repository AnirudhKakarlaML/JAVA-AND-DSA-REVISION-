public class LC2114_MaximumNumberOfWordsFoundInSentences {
    public static void main(String[] args) {
        String[] sentences = {"I Love LC" , "I To Love LC"};
         int maxCount = 0;
        for(int i = 0 ; i < sentences.length ; i++){
            int count = 1;
            for(int j =0 ; j < sentences[i].length() ; j++){
                if(sentences[i].charAt(j)==' '){
                    count++;
                }

        }
         if(count > maxCount){
                maxCount = count;
            }
        }
        System.out.println(maxCount);
    }
}
