import java.util.*;
class Car{
    String brand;
    String model;
    String type;
    int seatcap;
    double price;
    Engine engine;

    Car(String brand,String model,String type,int seatcap,double price,String etype,double bhp,int nopiston,int gears){
        super();
        this.brand=brand;
        this.model=model;
        this.type=type;
        this.seatcap=seatcap;
        this.price=price;
        this.engine=new Engine(etype,bhp,nopiston,gears);
        this.engine=new Engine("CI",300,4,5);

        System.out.println("Car Obj IS Created");

    }
    void displayCar(){
        System.out.println("*************** Car Details ***********************");
        System.out.println("Car Brand: "+this.brand);
        System.out.println("Car Model: "+this.model);
        System.out.println("Car Type: "+this.type);
        System.out.println("Car SeatCapacity: "+this.seatcap);
        System.out.println("Car Price: "+this.price);
 

    }
}

class Engine{
    String etype;
    double bhp;
    int nopiston;
    int gears;


    Engine( String type,double bhp,int nopiston,int gears){
        this.etype=etype;
        this.bhp=bhp;
        this.nopiston=nopiston;
        this.gears=gears;

    }
    void displayCar(){
        System.out.println("*************** Car Details ***********************");
        System.out.println("Engine Type: "+this.etype);
        System.out.println("Engine bhp: "+this.bhp);
        System.out.println("Engine Number Of Piston: "+this.nopiston);
        System.out.println("Gears: "+this.gears);
 

    }
}


public class CompositionExample {
    public static void main(String[] args) {
        
        Car obj=new Car("TATA","NEXON","HATCHBACK",5,850000,"CI",300,4,5);
        obj.displayCar();
    }
}
