import java.util.Scanner;
public class CalculatorUsingParameterisedMethod {
    
    public static void main(String[]args){
       
        Scanner sc=new Scanner (System.in);

        System.out.println("Enter first Number");
        int a=sc.nextInt();
        System.out.println("Enter Second Number");
        int b=sc.nextInt();

        add(a,b);
    }
    public static void add(int a,int b){

        Scanner sc=new Scanner (System.in);

        System.out.println("Which Operation You Want To Perfrom");
        String i=sc.nextLine();

        switch(i){
            case "add"->{
                System.out.println("Addition is: "+(a+b));
            }
            case "sub"->{
                System.out.println("Subtraction is: "+(a-b));

            }
            case "mul"->{
                System.out.println("Multiplication is: "+(a*b));

            }
            case "div"->{
                System.out.println("Division is: "+(a/b));

            }
            case "mod"->{
                System.out.println("Reminder is: "+(a%b));

            }

        }


        
    }

    
}
