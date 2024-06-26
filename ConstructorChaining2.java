class Parent{
    Parent(){
        super();//It Access Parent But In Parent Class No any Execution Then It Access Below Statement 
        System.out.println("No Argument Constructor Of Parent Class");
    }
    Parent(int a){
        this(); //It Access Self Class
        System.out.println("Parameterised Constructor Of Parent Class......");

    }
}
class Child extends Parent{
    Child(){
        this((byte)10);//It Accessing  self
        System.out.println("No Argument Constructor Of Child Class");
    }
    Child(byte b){
        super(5);//It Access Parent class(); After Accessing Child Class They Will Be Acess itself
        System.out.println("Byte Argument Constructor");
    }
}

public class ConstructorChaining2 {

    public static void main(String[]args){
        Child c1=new Child();
    }
}

