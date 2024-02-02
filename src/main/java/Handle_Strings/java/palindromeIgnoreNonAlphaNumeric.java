package Handle_Strings.java;

import java.util.Scanner;

public class palindromeIgnoreNonAlphaNumeric {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        filter(s);

        reverse(s);

        System.out.println(STR."The palindrome is :\{isPalindrome(s)}");


    }

    public static boolean isPalindrome(String s){
        String reverse  =reverse(s);

        return reverse.equals(s);
    }
    public static String filter(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                sb.append(i);
            }
        }
        return sb.toString();
    }

    public static String reverse(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.toString();

    }
}