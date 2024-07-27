class Parent3{
    public static Object greeting(){
        System.out.println("Good Afternoon");
        return null;
    }
}
public class MethodShadowingNonprimitiveType extends Parent3{
    public static Object greeting(){
        System.out.println("Good Night");
        return null;
    }
    public static void main(String[]args){
        greeting();
    }
}

//In that code there use NonPrimitive Data Type They Must Be Same Or Convarient to Parent To Child

//covarent is like Object Type And String Type Because Of Object Is Super Class 