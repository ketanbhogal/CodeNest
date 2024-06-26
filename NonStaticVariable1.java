public class NonStaticVariable1 {
    int a=100;
    static{
        // System.out.println(a); Cannot make a static reference to the non-static field
    }
    {
        System.out.println(a+" NonStatic Block");
    }
    
    public static void main(String[] args) {
        NonStaticVariable1 obj=new NonStaticVariable1();
        System.out.println(obj.a+" Main ()");
        
    }
    public void m1(){
        System.out.println(a);
    }
    
}
