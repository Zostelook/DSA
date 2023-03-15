import java.io.*;
import java.lang.*;
import java.util.Scanner;

public class PrimeNumber {

    int sum(int x , int y){
        return x+y;

    }
    int sum(int []arr, int n){
        int sum =0;
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        return sum;
    }

    int sum(int [][]ar, int n,int m){
        int sum =0;
        for(int i=0; i<ar.length; i++){
            for(int j=0; j<ar[0].length; j++){
                sum = sum +ar[i][j];
            }
        }
        return sum;
    }

    public static void main(String[]ss){

    }
}



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static boolean isPrime(int n){

        if(n<=1){
            return false;
        }

        if(n==2){
            return true;
        }
        
        for(int i=2; i<n/2; i++){
            if(n%i==0){
                return false;
            }
        }
       return true;
    }
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        System.out.println(isPrime(n));
    }
}
