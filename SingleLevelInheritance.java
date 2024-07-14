class Laptop{
    String brand;
    String model;
    double price;
    int ram;
    int rom;
    String processor;

    Laptop(String brand,String model,double price,int ram,int rom,String processor){
        super();
        this.brand=brand;
        this.model=model;
        this.price=price;
        this.ram=ram;
        this.rom=rom;
        this.processor=processor;
    }
    void displayLaptop(){
        System.out.println("Laptop[Brand: "+this.brand+", Model: "+this.model+", Price Is: "+this.price+"rs, Ram is: "+this.ram+"gb ,Rom Is: "+this.rom+"gb, Processor Is: "+this.processor);
    }
}
class GamingLaptop extends Laptop{
    String graphicCard;
    boolean coolingSystem;
    String Keyboard;
    
    
    GamingLaptop(String graphicCard, boolean coolingSystem,String Keyboard,String brand,String model,double price,int ram,int rom,String processor){
        super(brand,model,price,ram,rom,processor);
        this.graphicCard=graphicCard;
        this.coolingSystem=coolingSystem;
        this.Keyboard=Keyboard;

    }
    void displayGaming(){
        System.out.println("Gaming Laptop[GraphicCard: "+this.graphicCard+", Cooling System: "+this.coolingSystem+", Keyboard: "+this.Keyboard);
    }


}
public class SingleLevelInheritance {
    public static void main(String[]args){
        GamingLaptop obj=new GamingLaptop("RTX 4050",true,"RGB Light","Lenovo","Ideapad Gaming3",70000,16,512,"i5");
        obj.displayLaptop();
        obj.displayGaming();

    }
    
}
