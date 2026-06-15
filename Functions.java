/*class functions{
    public static int sum(int a , int b){
        return a+b;
    }

    public static void main(String[] args){
        int x = sum(1 , 2);
        System.out.println(x);
    }
}*/

/*class functions{
    public static int max(int a , int b){
        return (a>b)?a:b;
    }

    public static void main(String[] args){
        int x = max(1 , 2);
        System.out.println(x);
    }
}*/

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

/*public class GCD {

    public static int gcd(int a, int b) {

        while (b != 0) {

            int rem = a % b;
            a = b;
            b = rem;

        }

        return a;
    }

    public static void main(String[] args) {

        int x = gcd(18, 12);
        System.out.println(x);

    }
}*/

//LCM
//Approach-Create GCD FUNCT And Then Use It As Helper Function In LCM Function
/*public class functions{
    public static int GCD(int a , int b){
        int c;
        while(b != 0){
            c = a % b;
            a = b;
            b = c;
        }
        return a;

    }
    public static int LCM(int a , int b){
        int lcm = (a * b) / GCD(a , b);
        return lcm;
    }
    public static void main(String[] args) {
        int x = LCM(2, 4);
        System.out.println(x);
    }
}*/

/*public class primecheck{
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i = 2 ; i<=(int)Math.sqrt(n);i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        boolean x = isPrime(7);
        System.out.println(x);
    }

}*/

