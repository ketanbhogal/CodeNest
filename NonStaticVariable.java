public class NonStaticVariable {
    String str;
    public static void main(String[]args){
        NonStaticVariable obj=new NonStaticVariable();
        obj.str="Ramesh";
        System.out.println(obj.str);
        NonStaticVariable obj1=new NonStaticVariable();
        obj1.str="Suresh";
        System.out.println(obj1.str);


    }
    
}
