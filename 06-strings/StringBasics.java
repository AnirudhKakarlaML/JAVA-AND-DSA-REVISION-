public class StringBasics {
    public static void main(String[] args) {
        String s = "Hello World";

        // 1. Length and characters
        System.out.println("Length: " + s.length());          // 11
        System.out.println("First char: " + s.charAt(0));      // H

        // 2. Loop through each character
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + " ");
        }
        System.out.println();

        // 3. Common methods
        System.out.println(s.toUpperCase());                   // HELLO WORLD
        System.out.println(s.toLowerCase());                   // hello world
        System.out.println(s.substring(0, 5));                 // Hello
        System.out.println(s.contains("World"));               // true
        System.out.println(s.indexOf('o'));                    // 4

        // 4. Comparing strings: use equals(), NOT ==
        String a = "java";
        String b = new String("java");
        System.out.println(a == b);                            // false (different objects)
        System.out.println(a.equals(b));                       // true  (same content)

        // 5. Reverse a string using StringBuilder
        String rev = new StringBuilder(s).reverse().toString();
        System.out.println(rev);                               // dlroW olleH

        // 6. Check palindrome
        System.out.println(isPalindrome("madam"));             // true
        System.out.println(isPalindrome("hello"));             // false
    }

    // Two-pointer palindrome check
    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}