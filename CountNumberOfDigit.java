import java.util.Scanner;
public class CountNumberOfDigit {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Any Number");
        int a=sc.nextInt();
        int count=0;

        do{
            int r=a%10;
            count++;
            a=a/10;
        }while(a>0);
        System.out.println("Number Of Count Of Digit Is: "+count);


    }
    
}




                        /*output:-
                        
                          compile Time = Success
                          Run Time = Sucess
                          Enter The Any Number
                          555
                          Number Of Count Of Digit Is: 3
                          */