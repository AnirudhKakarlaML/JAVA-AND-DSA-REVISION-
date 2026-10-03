public class Substring {
    public static void main(String[] args) {
        String str1 = "Helloworld";
        String sub="";
        for(int i = 0 ; i < 5 ; i++){
            sub+=str1.charAt(i);
        }
        System.out.println(sub);
        String x=str1.substring(0, 5);
        System.out.println(x);
    }
}
