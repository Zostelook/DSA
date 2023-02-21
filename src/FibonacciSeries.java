public class FibonacciSeries {
    static void fibonacci(int t){
         int t1 =0, t2 = 1, t3,i;
        System.out.println();
        System.out.print(t1+" "+t2+" ");


        for(i=2; i<t; i++){
            t3 = t2+t1;
            System.out.print(t3+" ");
            t1 =t2;
            t2=t3;

        }


    }
    public static void main(String[]ss){
        fibonacci(40);
    }
}
