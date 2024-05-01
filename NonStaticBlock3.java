public class NonStaticBlock3 {
    {
        int a=5;
        int b=15;
        int c=a+b;
        System.out.println(c);


    }

    public static void main(String[]args){
        new NonStaticBlock3();
        System.out.println("Main Method");
    }
    
}
