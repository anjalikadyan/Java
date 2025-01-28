import java.util.Scanner;
public class javaArray {
    public static void main(String[] args){
        int[] arr;
        arr=new int[3];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<3;i++){
            System.out.printf(arr[i]+" ");
        }
    }
}
