public class PalindromeCheck {//Own Version Not Lecture 
    public static void main(String[] args) {
        String name = "noon";//No Spaces //No Capitals
        String check="";
        for(int i = name.length()-1 ; i>=0 ; i--){
            check+=name.charAt(i);
        }
        System.out.println(check);
        if(check.equals(name)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
