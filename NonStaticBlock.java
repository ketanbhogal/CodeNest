public class NonStaticBlock {
public static void main(String[]args){
    Bottle b1=new Bottle();
    System.out.println("*********************");
    b1.display();
}

}

class Bottle{
    String brand="Milton";
    double capacity;
    String color;

    {
        capacity=1000;
        color="Orange";
        System.out.println("Executed During Object Loding !!!!!!!!");

    }
    
    {
        System.out.println("Created Bottle Block !!!!!!!!");

    }

    public void display(){
        System.out.println(brand);
        System.out.println(capacity);
        System.out.println(color);


    }

    
}


//In Above Programm they will be the Execute Non Static Block At Object Loding Time 
