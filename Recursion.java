import java.util.*;

public class Recursion {
    public static void naturalnumber(int n){
        if(n==0){
            return;
        }
        if(n>0){
            naturalnumber(n-1);
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int n = sc.nextInt();
          naturalnumber(n);
    }
}
