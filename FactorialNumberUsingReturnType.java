import java.util.Scanner;
public class FactorialNumberUsingReturnType {
    
    public static String factorial(int num){

        int fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        return num+" Factorial Is: "+fact;
    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number");
        int num=sc.nextInt();
        System.out.println(factorial(num));
    }
}
