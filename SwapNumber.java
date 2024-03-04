import java.util.Scanner;
public class SwapNumber {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your Bank Balance");
        int a=sc.nextInt();
        System.out.println("Enter Your Friend Bank Balance");
        int b=sc.nextInt();
        
        // using Third Variable
        int c=a;
        a=b;
        b=c;
        System.out.println("After Your Bank Balance"+a);
        System.out.println(" After Your Friend Bank Balance"+b);



        //Without using Third Variable
        a=a+b;
        a=a-b;
        b=a-b;
        
        
        System.out.println("\n\n!!! Your Bank Balance"+a);
        System.out.println(" !!! Your Friend Bank Balance"+b);




        //Without Using Third Variable Using Multiplication And Division Swap Number


        a=a*b;
        a=a/b;
        b=a-b;

        System.out.println("\n\n### Your Bank Balance"+a);
        System.out.println(" ### Your Friend Bank Balance"+b);

    }
    
}
