import java.io.*;
import java.util.*;
public class file {
    public static void main(String[] args){
        try{
            File file=new File("data.txt");
            FileWriter write=new FileWriter("data.txt");
            Scanner sc= new Scanner(file);
            if(file.createNewFile()){
                System.out.println("The file is created. "+file.getName());
            }else{
                System.out.println("the file not created. "+file.getName());
            }
            write.write("hello i am anjali kadyan from sukertal");
            write.close();
            while(sc.hasNextLine()){
                String line=sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }
        catch(Exception e){
            System.out.println("error "+e);
        }
    }
}
