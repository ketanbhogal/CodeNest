import java.util.Scanner;
public class Palindrome {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Any Number");
        int a=sc.nextInt();
        int A=a;
        int rev=0;
        do{
           int r=a%10;
           rev=(rev*10)+r;
           a=a/10;
            
        }while(a>0);
        System.out.println(rev);

        if(rev==A){
            System.out.println("This Number Is  Palindrome");
        }
        else{
            System.out.println("This Number Is Not  Palindrome");
        }
    }
}
