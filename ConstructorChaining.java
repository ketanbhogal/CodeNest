class Mobile{
    String brand;
    double price;
    String color;
    int ram;
    int rom;

    Mobile(){
        System.out.println("No Argument Method");
    }

    Mobile(String brand){
        this();
        this.brand=brand;
        System.out.println("Parameterized Method (String brand)");

    }


    Mobile(String brand,double price){
        this(brand);
        this.price=price;
        System.out.println("Parameterized Method (String brand,double price)");
    }

    Mobile(String brand,double price,String color){
        this(brand,price);
        this.color=color;
        System.out.println("Parameterized Method (String brand,double price,String color)");
    }
    

    Mobile(String brand,double price,String color,int ram){
        this(brand,price,color);
        this.ram=ram;
        System.out.println("Parameterized Method (String brand,double price,String color,int ram)");
    }

    Mobile(String brand,double price,String color,int ram,int rom){
        this(brand,price,color,ram);
        this.rom=rom;
        System.out.println("Parameterized Method (String brand,double price,String color,int ram,int rom)");
    }

    public void displayMobile(){
        System.out.println(brand);
        System.out.println(price);
        System.out.println(color);
        System.out.println(ram);
        System.out.println(rom);
        System.out.println("**********************************************************");
    }
}

public class ConstructorChaining {
    public static void main(String[]args){
            Mobile m1=new Mobile("Samsung",25000,"Black",8,256); 
            m1.displayMobile();
    }
    
}
