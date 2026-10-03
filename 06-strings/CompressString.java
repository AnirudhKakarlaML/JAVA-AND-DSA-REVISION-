public class CompressString {
    public static String CompressedString(String str){
        StringBuilder sb = new StringBuilder("");
        for(int i = 0 ; i < str.length() ; i++ ){
            char ch = str.charAt(i);
            int count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(ch);
            if(count>1){
                sb.append(count);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s1 = "aabbccddee";
        System.out.println(CompressedString(s1));
    }
}
