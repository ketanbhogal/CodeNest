class Fruit{
    String name;
    double price;
    String color;

    public Fruit displayName(){
        System.out.println(name);
        return this;
    }
    public Fruit displayPrice(){
        System.out.println(price);
        return this;
    }
    public Fruit displayColor(){
        System.out.println(color);
        return this;
    }


}
public class MethodChaining {
    public static void main(String...args){
        Fruit f1=new Fruit();
        f1.name="Mango";
        f1.price=250;
        f1.color="Yellow";

        f1.displayName().displayPrice().displayColor();

    }

    // method Chaining is used to call more than one method at a time it will call one method after another method
    
}
