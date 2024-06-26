public class NonStatic extends Demo3 {
    public static void main(String[]args){
        NonStatic ns=new NonStatic();
        ns.m1();

    }
    public void m1(){
        System.out.println("Hii From M1() Of NonStatic");
        m2();
    }
    public void m2(){
        System.out.println("Hii from m2() of nonstatic....");
        // Demo3 obj=new Demo3();
        // obj.m3();
        super.m3();

        //Using Inheritance We Can Access Nonstatic Member Without creating Object
    }
    
}
class Demo3{
    public void m3(){
        System.out.println("Hii From M3() of Demo3");
    }

}
