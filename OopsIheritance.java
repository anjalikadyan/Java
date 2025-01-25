import java.util.Scanner;

public class OopsIheritance {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int de1=sc.nextInt();
        String de2=sc.nextLine();
        sc.close();
        develop de=new develop(de1,de2);
        de.eat();
    }
}
class develop extends person{
    public develop (int age,String name){
        super(age,name);
    }
}
class person{
    String name;
    int age;
    //constructor of class
    public person(int age,String name){
        this.age=age;
        this.name=name;
    }
    void walk(){
        System.out.println(name + " is walking");
    }
    void eat(){
        System.out.println(name + " is eating");
    }
    void walk(int d){
        System.out.println(name + " is walked "+d+" steps.");
        
    }
}
