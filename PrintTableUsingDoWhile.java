import java.util.Scanner;
public class PrintTableUsingDoWhile {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Number Which Table You Want To Print:");
        int a=sc.nextInt();

        int b=1;
        do{
            System.out.println(a+"*"+b+"="+ a*b);
            b++;
        }while(b<=10);
    }
    
}






                        /*output:-
                          compile Time = Success
                          Run Time = Sucess
                          

                          Enter Number Which Table You Want To Print:
                          9
                          9*1=9
                          9*2=18
                          9*3=27
                          9*4=36
                          9*5=45
                          9*6=54
                          9*7=63
                          9*8=72
                          9*9=81
                          9*10=90
                          */