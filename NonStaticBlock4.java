public class NonStaticBlock4 {
    {
        System.out.println("NonStatic Block");

    }
    static{
        System.out.println("Static block");

    }
    public static void main (String []args){
        System.out.println("Main Method");
        NonStaticBlock4 obj=new NonStaticBlock4();
    }
    
}


// output:-
// Static block
// Main Method
// NonStatic Block
