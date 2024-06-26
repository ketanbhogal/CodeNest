class Mobile{
    String brand;
    String model;
    String color;
    int ram;
    int rom;

    Mobile(String brand,String model,String color,int ram,int rom){
        this.brand=brand;
        this.model=model;
        this.color=color;
        this.ram=ram;
        this.rom=rom;

    }
    Mobile( Mobile m1){
        this.brand=m1.brand;
        this.model=m1.model;
        this.color=m1.color;
        this.ram=m1.ram;
        this.rom=m1.rom;


    }

    public void displayMobile() {
        System.out.println("Mobile Brand Is:" + brand + " And Mobile Model Is:" + model + " Color Of Mobile Is:" + color+ " Ram Is: " + ram + "gb And Rom:" + rom + "gb");
        System.out.println();
    }
}

public class CopyConstructor1 {
    public static void main(String[] args) {
        Mobile m1 = new Mobile("Samsung", "S24", "Black", 16, 256);
        m1.displayMobile();

        Mobile m2=new Mobile(m1);
        m2.displayMobile();

    }

}
