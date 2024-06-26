class parent{
    parent(){
        super();
        System.out.println("No Argument Constructor Of Parent Class");
    }
}
class child extends parent{
    child(){
        super();
        System.out.println("No Argument Constructor Of Child Class");
    }
}
public class ConstructorChaining1 {
    public static void main(String[] args) {
        child c1=new child();
    }
    
    
}
