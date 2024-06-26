public class MobileObject {
    public static void main(String[]args){
        MobileObjectDriver mob=new MobileObjectDriver();
        
        mob.mbrand="Samsung";
        mob.mmodel="S24";
        mob.price=142000;
        mob.mcolor="Black";
        mob.ram=16;
        mob.rom=256;
        mob.displayMobile();

    }
}
    class MobileObjectDriver{
        String mbrand;
        String mmodel;
        int price;
        String mcolor;
        int ram;
        int rom;
        public  void displayMobile(){
            System.out.println("Mobile Brand is:"+mbrand);
            System.out.println("Mobile Model is:"+mmodel);
            System.out.println("Mobile Price is:"+price);
            System.out.println("Mobile Color is:"+mcolor);
            System.out.println("Mobile RAM is:"+ram);
            System.out.println("Mobile ROM is:"+rom);

        }
    }
    

