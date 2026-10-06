public class Splitfunction {
    public static void main(String[] args) {
        String me = "I Am Anirudh";
        String[]words = me.split(" ");
        System.out.println(words.length);
        for(int i = 0 ; i < words.length ; i++){
            System.out.println(words[i]);
        }


    }
}
