import java.util.Scanner;
public class SunnyNumber {
    public static void main(String[]args){
        //n+1=perfect square 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int a=sc.nextInt();

        int result=a+1;
        

        
        double squareRoot = Math.sqrt(result);
        int num=(int)squareRoot;
        System.out.println(squareRoot);

        if(squareRoot==num){
            System.out.println("Given Number Is Sunny Number");
        }
        else{
            System.out.println("Given Number Is Not Sunny Number");
        }

    }
    
}



