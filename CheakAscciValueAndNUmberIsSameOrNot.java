import java.util.Scanner;
public class CheakAscciValueAndNUmberIsSameOrNot {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        char c='D';
        System.out.println("Enter The Int Value:");
        int a=sc.nextInt();
        //convert char to int by explicit typecasting
        int b=(int)c;
        //it cheak both value are same or not
        String result=(a==b)?("Both Value Are Same"):("Both Value Are Different");
        System.out.println(result);

    
}
}







                        /*output:-
                          compile Time = Success
                          Run Time = Sucess
                          Enter The Int Value:  
                          82
                          Both Value Are Different
                     */




