/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if(num > 0){
            System.out.println("Positive");
        }
        else if(num < 0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }

        sc.close();
    }
}*/

/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }

        sc.close();
    }
}*/

/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        if(age >= 18){
            System.out.println("Eligible");
        }
        else{
            System.out.println("Not Eligible");
        }

        sc.close();
    }
}*/

/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if(num % 5 == 0 && num % 11 == 0){
            System.out.println("Divisible");
        }
        else{
            System.out.println("Not Divisible");
        }

        sc.close();
    }
}*/

/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a > b){
            System.out.println(a);
        }
        else{
            System.out.println(b);
        }

        sc.close();
    }
}*/

//Smaller of two numbers
/*import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_1 = sc.nextInt();
        int num_2 = sc.nextInt();
        if(num_1<num_2){
            System.out.println("Num 1 is less than num 2");
        }
        else{
            System.out.println("num2 is less than num 1");
        }
    }
}*/

/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a > b && a > c){
            System.out.println(a);
        }
        else if(b > a && b > c){
            System.out.println(b);
        }
        else{
            System.out.println(c);
        }

        sc.close();
    }
}*/

//Largest Of Four Numbers
/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int largest = a;

        if(b > largest) {largest = b;}
        if(c > largest) largest = c;
        if(d > largest) largest = d;

        System.out.println(largest);

        sc.close();
    }
}*/

//second largest among three numbers
/*import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if((a>b && a<c) || (a<b && a>c)){
            System.out.println(a);
        }
        else if((b>a&&b<c) ||  (b<a && b>c)){
            System.out.println(b);
        }
        else{
            System.out.println(c);
        }
    }
}*/

/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int marks = sc.nextInt();

        if(marks >= 90){
            System.out.println("A");
        }
        else if(marks >= 75){
            System.out.println("B");
        }
        else if(marks >= 60){
            System.out.println("C");
        }
        else if(marks >= 35){
            System.out.println("D");
        }
        else{
            System.out.println("Fail");
        }

        sc.close();
    }
}*/

//Login System
/*import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        String password = sc.nextLine();
        if(username.equals("admin")&&password.equals("1234")){
            System.out.println("Access Granted");
        }
        else{
            System.out.println("Access Denied");
        }
    }
}*/

//Largest Using Terenary 
/*import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = (a>b)? a :b;
        System.out.println((result));


    }
}*/
