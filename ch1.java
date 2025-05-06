import java.util.Scanner;
public class ch1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int total=567
        ;
        int math=sc.nextInt();
        int sci=sc.nextInt();
        int soci=sc.nextInt();
        int english=sc.nextInt();
        int art=sc.nextInt();
        sc.close();
        int stu=math+sci+soci+english+art;
        double per=stu/total;
        System.out.println("The Total number: "+per);
    }
}
