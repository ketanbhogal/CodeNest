import java.util.Scanner;
public class PrintTableAndFindEvenOddNumber {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter Number Which You Want To  Print Table:");
        int a=sc.nextInt();
        int b=1;
        int r;
        int even=0;
        int odd=0;
        do{
            System.out.println(b+"*"+a+"="+(r=a*b));
            if(r%2==0){
                even++;
            }
            else{
                odd++;
            }
            b++;
        }while(b<=10);
        System.out.println("Count Odd Number="+odd);
        System.out.println("Count Even Number="+even);


    }
    
}



                        /*output:-
                          compile Time = Success
                          Run Time = Sucess
                          Enter Number Which You Want To  Print Table:
                          28
                          1*28=28
                          2*28=56
                          3*28=84
                          4*28=112
                          5*28=140
                          6*28=168
                          7*28=196
                          8*28=224
                          9*28=252
                          10*28=280
                          Count Odd Number=0
                          Count Even Number=10
                          */