// write a java program to find the product of digits using recursion
 
import java.util.Scanner;
public class RecursionQuestion4 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num= sc.nextInt();
        System.out.println(product(num));
    }
    public static int product(int num){
        if(num<=9){
            return num;
        }
        else{
            return num%10*product(num=num/10);
        }
    }
}