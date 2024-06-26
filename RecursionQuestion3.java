// write a java program to find sum of digits using method recursion 
import java.util.Scanner;
public class RecursionQuestion3 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num= sc.nextInt();
        System.out.println("sum is the: "+digit(num));
 
    }
    public static int digit(int num)
{
    if(num<=9){
        return num;
    }
    else{
       return num%10+digit(num=num/10);
    }
}    
}
