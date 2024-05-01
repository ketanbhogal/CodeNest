class Laptop{
    String brand;
    double price;
    String color;
    int ram;
    int storage;

    Laptop(){
        System.out.println("This Is No Argument Method !!!!!!!!!@@@@@@######");
    }

    Laptop(String brand){
        this.brand=brand;
        System.out.println(brand);
    }

    Laptop(String brand,double price,String color){
        this.brand=brand;
        this.price=price;
        this.color=color;
    }

        public void displayLaptop(){
            System.out.println(brand);
            System.out.println(price);
            System.out.println(color);


        
    }
}
public class ConstructorOverloding {
    public static void main(String[]args){
        new Laptop();
        new Laptop("Lenovo");
        Laptop l1=new Laptop("Dell",75000,"Silver");
        l1.displayLaptop();

    }
    
}
