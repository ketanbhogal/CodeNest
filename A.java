class A {
    public static void main(String[]args){
        System.out.println(StaticVariable2.a);       
        System.out.println(StaticVariable2.b);
        System.out.println(StaticVariable2.c);
        StaticVariable2.test();
    }

}
class StaticVariable2 {
    static int a;
    static double b;
    static String c;
    public static void test(){
    System.out.println(a);       
    System.out.println(b);
    System.out.println(c);
    }
}

