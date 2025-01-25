public class OopsEncasulation {
    public static void main(String[] args){
        laptop li= new laptop();
        li.setprice(34);
    }
}
class laptop{
    int ram;
    int price;
    public void setprice(int price){
        boolean admin=false;
        if(!admin){
            System.out.println("You cannot set the price");
        }else{
            this.price=price;

        }
    }
}
