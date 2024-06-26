public class StaticBlock1 {
    static int a=Demo1.m1();
    // it will acess First Demo1 class And Next M1() method
    static{
        System.out.println("SB From From StaticBlock1()");

    }
    public static void main(String[]args){
        System.out.println("HII From Main Method ");

    }
    
}
class Demo1{
    static{
        System.out.println("SB From From Demo1");
    }
    public static int m1(){
        System.out.println("HII from m1()");
        return 100;
    }
}
