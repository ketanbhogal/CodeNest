import java.util.Scanner;

public class PrimeNumberUsingReturnType {
    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number: ");
        int num=sc.nextInt();
        System.out.println(prime(num));


        }

    
    public static String prime(int num){
        int count=0;
        for(int i=2;i<num;i++){
            if(num%i==0){
                count++;
            }
        }

        
        if(count==0){
            return "This Is Prime Number";
        }
        else{
            return "This Is Not Prime Number";
        }
    
}
}
