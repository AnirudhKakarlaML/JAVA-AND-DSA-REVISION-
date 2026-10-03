public class CheckConsonantsAndVowelsGFG {
    
    static void checkString(String s) {
        int v = 0;
        int c = 0;

        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                v++;
            }
            else{
                c++;
            }
        }
        if(v > c){
            System.out.println("Yes");
        }
        else if(c>v){
            System.out.println("No");
        }
        else{
            System.out.println("Same");
            
        }
        
    }
}

