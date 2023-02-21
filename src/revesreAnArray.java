public class revesreAnArray {

    static int[]arr = new int[]{5,3,3,34,56,35,23};
    static void reverseArray(){
        int temp =0;

        int n = arr.length;
        int j = n-1;

        for(int i=0; i<j; i++,j--){
           temp =arr[i];
           arr[i]=arr[j];
           arr[j]=temp;

        }
    }
    public static void main(String []ss){
        reverseArray();
        for(int j=0; j<arr.length; j++){
            System.out.print(arr[j]+" ");
        }
    }
}
