import java.util.Scanner;
public class BuzzNumber {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Int Value:");
        int a=sc.nextInt();

        //in this first cheak number is greter then 10 and less then 99
        //second step is the number is small than 10 or greater than 99 then print Invalid Number
        //third step is cheak the last digit of given number is 7 or not and also cheak number is fully divided by 7 or not 
        //if that any one state is true then print Givan Number Is Buzz Number else print Givan Number Is Not Buzz Number
        String result=(a>=10&&a<100)?((a%10==7||a%7==0)?("*** Givan Number Is Buzz Number ***"):("Givan Number Is Not Buzz Number")):("!!! Invalid Number !!!");
        System.out.println(result);
    }
    
}




                        /*output:-
                          compile Time = Success
                          Run Time = Sucess  
                          Enter The Int Value:
                          14
                          *** Givan Number Is Buzz Number ***
                          


                          Enter The Int Value:
                          2
                          !!! Invalid Number !!!




                          Enter The Int Value:
                          15
                          Givan Number Is Not Buzz Number

                     */
