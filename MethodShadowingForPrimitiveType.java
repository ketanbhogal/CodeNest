class Main{
    public static int greeting(){
        System.out.println("Good Evening");
        return 0;
    }
}
public class MethodShadowingForPrimitiveType extends Main {
    public static int greeting(){
        System.out.println("Good Night");
        return 0;
    } 
    public static void main(String[]args){
        greeting();
    }
}

// In that Code We Can Used For The Primitive Data type There Are Used Same DataType in Both Method