public class Method {
    public static void demo(){
        System.out.println("Hii From Demo Class()");
        // int a=10;
        demo1();
    }

    public static void main(String[]args){
        
        System.out.println("Hii From Main Class()");
        demo();
    }
    
    public static void demo1(){
        System.out.println("Hii From Demo1 Method()");
    }
}
