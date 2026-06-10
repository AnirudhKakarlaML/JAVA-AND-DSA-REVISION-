/*public class s2{
    public static void main(String[] args) {
        int i = 1;
        while(i<=50){
            System.out.println(i);
            i++;
        }
    }
    
}*/

/*public class s2{
    public static void main(String[] args) {
        int i = 50;
        while(i>=1){
            System.out.println(i);
            i--;
        }
    }
}*/

/*import java.util.*;
public class s2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(i<=n){
            if(i % 2 == 0){
            System.out.println(i);
            }
            i++;
        }
    }
}*/

/*import java.util.*;
public class s2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(i<=n){
            if(i % 2 != 0){
            System.out.println(i);
            }
            i++;
        }
    }
}*/

/*import java.util.*;
public class s2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        int sum = 0;
        while(i<=n){
            sum+=i;
            i++;
        }
        System.out.println(sum);
    }
}*/

/*import java.util.*;
public class s2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int ld;
        while(n>0){
            ld = n % 10;
            count+=1;
            n = n /  10;
        }
        System.out.println(count);
    }
}*/

/*import java.util.*;
public class s2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int ld;
        while(n>0){
            ld = n % 10;
            sum+=ld;
            n = n / 10;
        }
        System.out.println(sum);
    }
}*/

/*import java.util.*;
public class s2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        int ld;
        while(n>0){
             ld = n % 10;
             rev = rev*10+ld;
             n = n / 10;

        }
        System.out.println(rev);
    }
}*/

//Palindrome Can Be Done In The Same Way Just need to store original number in another var and comparing

/*import java.util.*;
public class s2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ld = 0;
        int largest = 0;
        while(n>0){
            ld = n % 10;
            if(ld>largest){
                largest = ld;
            }
            n = n / 10;
        }
        System.out.println(largest);
    }
}*/

//Break And Continue Statements
/*public class s2{
    public static void main(String[] args) {
        int i = 1;
        while(i<=100){
            System.out.println(i);
            if(i == 57){
                break;
            }
            i++;
        }
    }
}*/

//Not Understood continue question explain

/*import java.util.*;
public class s2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean is_prime = true;
        for(int i = 2 ; i<n ; i++){
            if(n % i == 0){
                is_prime = false;
            
            }
        }
        if(is_prime == true){
            System.out.println("The Number is a prime");
        }
        else{
            System.out.println("The Number Is Not Prime");
        }

    }
}*/
//Prime Range From 1 to n

/*import java.util.Scanner;

public class s2 {

    public static boolean is_prime(int n){

        if(n <= 1){
            return false;
        }

        if(n == 2){
            return true;
        }

        for(int i = 2; i < n; i++){

            if(n % i == 0){
                return false;
            }
        }

        return true;
    }

    public static void prime(int n){

        for(int i = 1; i <= n; i++){

            if(is_prime(i)){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        prime(n);
    }
}*/


