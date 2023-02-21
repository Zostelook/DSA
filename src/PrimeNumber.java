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
