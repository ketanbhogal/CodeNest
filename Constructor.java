class Shoe{
    String brand;
    double price;
    int size;

    public void displayShoe(){
    System.out.println(brand);
    System.out.println(price);
    System.out.println(size);      

    }
    Shoe(){

    }
}
public class Constructor {
    public static void main(String[]args){
        Shoe s1=new Shoe();
        s1.brand="Nike";
        s1.price=50000;
        s1.size=9;
        s1.displayShoe();
    }
    
}


// IN THE GIVEN CODE CREATE A CONSTRUCTOR AND IT WILL CALL WITH THE HELP OF CRETING OBJECT;