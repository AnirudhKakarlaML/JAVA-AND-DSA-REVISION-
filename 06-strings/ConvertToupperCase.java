public class ConvertToupperCase {
    public static  StringBuilder Capitialize(String str){
        StringBuilder sb = new StringBuilder("");
        for(int i = 0 ; i < str.length() ; i++){
            if(i == 0 || (i-1) == ' '){
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb;
    }
    public static void main(String[] args) {
        String x = "hi hello";
        System.out.println(Capitialize(x));
    }
}
