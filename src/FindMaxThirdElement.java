import java.io.*;
import java.util.*;

public class FindMaxThirdElement {
    public static void main(String[]ss)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str[] = br.readLine().split(" ");

       // ArrayList<Integer> al = new ArrayList<>();

        int []arr = new int[N];

        for(int i=0; i<N; i++){
            arr[i] =Integer.parseInt(str[i]);
        }

        int indexFirst =0, indexSecond=0, indexThird = 0;
        for(int j =0; j<N; j++){
            if(arr[j]>= arr[indexFirst]){
                indexThird = indexSecond;
                indexSecond = indexFirst;
                indexFirst = j;
            }
            if(arr[j]>= arr[indexSecond] && arr[j]<= arr[indexFirst]){
                indexThird = indexSecond;
                indexSecond=j;
            }
            if(arr[j]>= arr[indexThird] && arr[j]<= arr[indexSecond]){
                indexThird = j;
            }
        }
        System.out.println(arr[indexThird]);


      //  System.out.print(al.toString());
    }
}
