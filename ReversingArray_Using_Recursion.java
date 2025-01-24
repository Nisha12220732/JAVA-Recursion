package Recurrsiontopic;

import java.util.Scanner;

public class ReversingArray_Using_Recursion {
    public static void reversefunc(int i,int[] arr){
        if(i >= arr.length/2){
            return;
        }
        reversefunc(i+1,arr);
        int temp = arr[i];
        arr[i] = arr[arr.length - i -1];
        arr[arr.length - i -1] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        reversefunc(0,arr);
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
