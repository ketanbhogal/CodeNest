public class StaticVariable {
    static int a=10;
    static int b;
    
    public static void demo1(){
        System.out.println(b);
        b=5;
        System.out.println(StaticVariable.b);

    }
    public static void main(String[]args){
        demo1();
        b=10;
        StaticVariable.demo1();
        }
    
}
