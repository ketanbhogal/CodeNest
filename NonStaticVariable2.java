public class NonStaticVariable2 {
    String str="NonStaticVariable In Class";
    static NonStaticVariable2 obj=new NonStaticVariable2();
    static{
        System.out.println(obj.str+" from static block");
    }
    {
        System.out.println(str+" from nonstatic block");
    }

    public static void main(String[] args) {
        System.out.println(obj.str+" from  Main()");
    }
    
}

// output:-
// NonStaticVariable In Class from nonstatic block
// NonStaticVariable In Class from static block
// NonStaticVariable In Class from  Main()
