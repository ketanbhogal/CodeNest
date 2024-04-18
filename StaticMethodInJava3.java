public class StaticMethodInJava3 {
    static int a;
    public static void demo(){
        System.out.println(a);
        a=10;//Reinitilize The Value Of a
        System.out.println(a);

    }
    public static void main(String[]args){
        System.out.println(a);
        demo();
        System.out.println(a);

    }
    
}
