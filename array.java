public class array {
    public static void main(String[] args){
        int[] marks={1,2,3,4,5,6,7};
        int a=marks.length;
        int last=marks[a-1];
        for(int i=a-1;i>0;i--){
            marks[i]=marks[i-1];
        }
        marks[0]=last;
        for(int i=0;i<a;i++){
            System.out.println(marks[i]);
        }
    }
}
