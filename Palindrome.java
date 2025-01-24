package Recurrsiontopic;

import java.util.Scanner;

public class Palindrome {
    public static boolean IsPalindrome(int i,String str){
        if(i>= str.length()/2){
            return true;
        }
        if (str.charAt(i) != str.charAt(str.length() - i - 1)) return false;
        return IsPalindrome(i+1,str);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if(IsPalindrome(0,str)){
            System.out.println(str + " is Palindrome");
        }
        else{
            System.out.println(str + " is not Palindrome");
        }
    }
}
