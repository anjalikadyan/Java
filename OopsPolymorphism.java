import java.util.Scanner;

public class OopsPolymorphism {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int de1=sc.nextInt();
        String de2=sc.nextLine();
        sc.close();
        person de=new person();
        de.age=de1;
        de.name=de2;
        System.out.println(de.age+" "+de.name);
        person p1=new person();
        p1.name="aajay";
        p1.age=45;
        System.out.println(p1.age+" "+p1.name);
        de.walk();
        p1.eat();
        de.walk(3);
    }
}
class person{
    String name;
    int age;
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
