

public class StringComparision{
    public static void main(String[] args) {
        String s1 = "Tony";
        String s2 = "Tony";
        String s3=new String("Tony");
        // if(s1 == s2){
        //     System.out.println("Equal");
        // }
        // if(s1 == s3){
        //     System.out.println(" Equal");
        // }
        // else{
        //     System.out.println("Not Equal");

        // } Not Right Method to compare strings
        if(s1.equals(s2)){
            System.out.println("Both Are Same");
        }
        else{
            System.out.println("Both Are Not Same");
        }
        //For s1 and s3
        if(s1.equals(s3)){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }
    }
}