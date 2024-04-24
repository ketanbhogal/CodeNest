public class StaticBlock2 {
    static {
        System.out.println("From Static Block 11111111");
    }
    static {
        System.out.println("From Static Block22222222");
    }
    public static void main(String[]args){
        System.out.println("From Main(String[])");
    }
    static {
        System.out.println("From Static Block333333333");
    }

    
}


//In this programm their are static block are executed directly before main method  
//in this programm their are firstly executed all static block and then executed main method 
