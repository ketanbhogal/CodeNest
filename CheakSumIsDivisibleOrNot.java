import java.util.Scanner;
public class CheakSumIsDivisibleOrNot {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Any Number");
        int a=sc.nextInt();
        int sum=0;
        int A=a;
        do{
           int r=a%10;
           sum=sum+r;
           a=a/10;
            
        }while(a>0);
        System.out.println(sum);
        if(A%sum==0){
            System.out.println("Divisible");
        }
        else{
            System.out.println(" Not Divisible");
        }

    }
}




                        /*output:-
                        
                          compile Time = Success
                          Run Time = Sucess

                          Enter The Any Number
                          21
                          3
                          Divisible

                          */
    
