public class CheakPriorityInStaticNonStaticAndConstructor {
    static{
        System.out.println("From Static Block 1");
    } 

    {
        System.out.println("From Non-Static Block 1");
    }

    CheakPriorityInStaticNonStaticAndConstructor(){
        System.out.println("From Constructor Block !!!!!!!!!!!!!!!");

    }
    static{
        System.out.println("From Static Block 2");
    } 

    {
        System.out.println("From Non-Static Block 2");
    }
    
    public static void main(String[]args){
        System.out.println("Main Start****");
        new CheakPriorityInStaticNonStaticAndConstructor();
        System.out.println("Main Ends");
    }
}

//IN THAT THERE WAS A FIRSTLY EXECUTE THE STATIC BLOCK(AT TIME CLASS LOADER TIME) THEN NON STATIC BLOCK (AT TIME CREATION OBJECT) AND LASTLY EXECUTE THE CONSTRUCTOR BLOCK
