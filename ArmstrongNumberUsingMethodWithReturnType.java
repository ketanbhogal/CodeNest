import java.util.Scanner;
public class ArmstrongNumberUsingMethodWithReturnType {

    public static String armstrongNumber(int num){
        int numcopy=num;
        int add=0;
        while(num>0){
            int rem=num%10;
            int c=1;
            c=rem*rem*rem;
            num=num/10;
            add=add+c;

        }
        if(numcopy==add){
            return "The Number Is Armstrong Number";
        }
        else{
            return "The Number Is Not Armstrong Number";
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number");
        int num=sc.nextInt();
        System.out.println(armstrongNumber(num));
    } 
    
}
