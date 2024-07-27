class Parent4{
    private static void greeting(){
        System.out.println("Good Afternoon");
    }
}

public class MethodShadowingAcessModifier  extends Parent4 {
    public static void greeting(){
        System.out.println("Good Night");
    }
    public static void main(String[]args){
        greeting();
    }
}


//in that program Incerease the scope Of Parent calss in Child Class AccessModifire