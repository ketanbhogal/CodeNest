class Vegetable{
    int quality=2;
    public void m1(){
        System.out.println(quality);
}
}

class Bringle extends Vegetable{
    double price=45.5;
    public void m2(){
        System.out.println(price);
    }
}
public class TypeCaste {
    public static void main(String[]args){
        Vegetable v=new Bringle();
        v.m1();
        // v.m2(); not run come compile time error we use down casting
        Bringle b=(Bringle)v;
        b.m1();
        b.m2();
    }
}
