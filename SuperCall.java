class Suresh{
    Suresh(){
        System.out.println("Hello From Suresh No Args Constructor");
    }
    Suresh(int a){
        System.out.println("Square is: "+a);
    }
}
class Ramesh extends Suresh{
    Ramesh(){
        super();
    }
    Ramesh(int a){
        super(a*a);
    }
}
public class SuperCall {
    public static void main(String[]args){
        Ramesh obj=new Ramesh();
        Ramesh obj1=new Ramesh(2);
    }
    
}
