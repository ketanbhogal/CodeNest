class Car{
    String name;
    double cost;
    String color;

}
public class CreateObject {
    public static void main(String[]args){
        Car c1=new Car();

        System.out.println(c1.name);
        System.out.println(c1.cost);
        System.out.println(c1.color);
        System.out.println("***************************\n");

     
        c1.name="fortuner";
        c1.cost=5000000;
        c1.color="Black";
        
        System.out.println(c1.name);
        System.out.println(c1.cost);
        System.out.println(c1.color);
        System.out.println("***************************\n");

        Car c2=new Car();
        c2.name="Thar";
        c2.cost=2500000;
        c2.color="Black";

        System.out.println(c2.name);
        System.out.println(c2.cost);
        System.out.println(c2.color);
        System.out.println("***************************");
        
    }
}
