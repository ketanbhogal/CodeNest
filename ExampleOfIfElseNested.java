import java.util.Scanner;
public class ExampleOfIfElseNested {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Two Digit Number:");
        int num=sc.nextInt();
        
        if(num>=10 && num<=99){
            System.out.println("Number Is Two Digit ");
            
            if(num%7==0 || num%10==7){
                System.out.println("Number Is Buzz");

            }
            else{
                System.out.println("NUmber Is Not Buzz");
            }
        }
        else {
            System.out.println("Number Is  Not Two Digit ");
               
        }
    }
}


                        /*output:-
                          compile Time = Success
                          Run Time = Sucess
                          

                          1.  Enter Two Digit Number:
                              777
                              Number Is  Not Two Digit 


                          2.  47
                              Enter Two Digit Number:
                              Number Is Two Digit 
                              Number Is Buzz



                           3. Enter Two Digit Number:
                               25
                               Number Is Two Digit 
                               NUmber Is Not Buzz
                     */
