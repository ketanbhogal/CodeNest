import java.util.Scanner;
public class PerfectNumberUsingMethodWithReturnType {
    public static String perfectNumber(int num){
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum=sum+i;
            }
        }
        if(sum==num){
            return "The Number Is Perfect Number";
        }
        else{
            return "The Number Is Not Perfect Number";
        }
    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number");
        int num=sc.nextInt();
        System.out.println(perfectNumber(num));
    }
    
}
