class Laptop{
    String brand;
    String model;
    String processor;
    String type;
    String color;
    double price;
    int ram;
    int rom;

    Laptop(String brand,String model,String processor,String type,String color,double price,int ram,int rom){

     this.brand=brand;
     this.model=model;
     this.processor=processor;
     this.type=type;
     this.color=color;
     this.price=price;
    this.ram=ram;
    this.rom=rom;
    }

    public void displayLaptop(){
        System.out.println("Laptop Brand Is: "+brand+" And Model IS: "+ model+" And Processor Is: "+processor);
        System.out.println("Laptop Type Is: "+type+" Laptop Color IS: "+color+" Laptop Price is: "+price+" Laptop Ram Is: "+ ram+" Laptop Rom Is: "+rom);
        System.out.println();
    }
    Laptop(Laptop obj){
        this.brand=obj.brand;
        this.model=obj.model;
        this.processor=obj.processor;
        this.type=obj.type;
        this.color=obj.color;
        this.price=obj.price;
       this.ram=obj.ram;
       this.rom=obj.rom;
    }
}
class CopyConstructor {
    public static void main(String[] args){
        Laptop obj=new Laptop("Lenovo","Ideapad 3","i5","Gaming","black",65000,8,512);
        obj.displayLaptop();
       

        Laptop obj1=new Laptop(obj);
        obj1.displayLaptop();

    }
}