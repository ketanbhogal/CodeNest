class Watch{
    String name;
    double price;
    String color;
    String type;
    Watch(){
        System.out.println("No Argument Method");
    }
    Watch(String name,double price,String type,String color){
        this.name=name;
        this.color=color;
        this.type=type;
        this.price=price;
    }
    public void displayWatch(){
        System.out.println(name);
        System.out.println(price);
        System.out.println(color);
        System.out.println(type);

    }

}
public class ParameterisedConstyructor {
    public static void main(String[]args){
        Watch w1=new Watch();
        w1.displayWatch();
        System.out.println("****************************************");
        Watch w2=new Watch("Casio",5000,"Black","Digital");
        w2.displayWatch();
    }

    
}
