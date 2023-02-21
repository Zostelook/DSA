import javax.lang.model.element.NestingKind;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws IOException {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);


        System.out.println("Enter your name :");
        String name = br.readLine();
        System.out.println("Enter another name");
        String nameT = br.readLine();

        String res = nameT+name;

        System.out.println(res);


        System.out.println("Enter an Interger ");
        int num =  Integer.parseInt(br.readLine());
        System.out.println("Enter another Interger:");
        int num2 = Integer.parseInt(br.readLine());

        int result = num+num2;
        System.out.println(result);

         System.out.println(Thread.currentThread().getName());


        int N = Integer.parseInt(br.readLine());

        int arr[] = new int[N];

        String str[]= br.readLine().split(" ");

        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(str[i]);

            System.out.print(arr[i]+" ");
        }



    }
}