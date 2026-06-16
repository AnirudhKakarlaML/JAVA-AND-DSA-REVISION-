/*public class eveOrodd{
    public static boolean even_odd(int n){
        if(n % 2 == 0){
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
        boolean x = even_odd(9);
        System.out.println(x);
    }
}*/

//Counting Digits Using Function
/*public class Count{
    public static int count(int n){
        int ld;
        int count = 0;
        while(n>0){
            ld = n % 10;
            count+=1;
            n = n / 10;
        }
        return count;
    }
    public static void main(String[] args) {
        int x = count(1234);
        System.out.println(x);
    }
}*/

/*public class gcd{
    public static int gcd(int a , int b){
        int c;
        while(a!=0 && b>0){
            c = a % b;
            a = b;
            b = c;
            if(a % b == 0){
                break;
            }

        }
        return b;

    }
    public static void main(String[] args) {
        int x = gcd(18 , 12);
        System.out.println(x);
    }

}*/

public class functions{
    public static boolean Isprime(int n){
        for(int i = 2 ; i<=(int)Math.sqrt(n) ; i++){
            if(n % i == 0){
            return false;}
        }
        return true;
    }
    public static void PrimeRange(int n){
        for(int i = 2; i<=n ; i++){
            if(Isprime(i)){
                System.out.println(i);
            }

        }
    }
    public static void main(String[] args) {
        PrimeRange(7);
    }
}