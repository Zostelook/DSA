import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InitialSomeValueInTwoDArray {

    public static void main(String []ss){

        int [][] arr = new int[6][6];

        for(int i=0; i<6; i++){
            for(int j =0; j <6 ; j++){
                arr[i][j] =5;


                System.out.print(arr[i][j]+" ");
            }
        }

        System.out.println(arr.length);



        for(int k=0; k<6; k++){
            for(int m =0; m<6; m++){
                System.out.print(arr[k][m]+" ");
            }
        }


    }


}

