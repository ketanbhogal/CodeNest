public class NonStaticBlock2 {
    {
        System.out.println("##################  From Non Static Block1 /////////////");
    }
    static{
        System.out.println("**************  From Static Block1 ****************** ");
    }


    public static void main(String[]args){
        System.out.println("::::::::: Main Method Start :::::::::");
        new NonStaticBlock2();
        System.out.println(":::::::::: Main Method End ::::::::::");

    }

    {
        System.out.println("##################  From Non Static Block2 /////////////");
    }
    static{
        System.out.println("**************  From Static Block2 ****************** ");
    }

}

//In this Programm There Are Static block First Exected And Then main Method in between  Non static Block Are Executed And Lastly Main Method Executed 