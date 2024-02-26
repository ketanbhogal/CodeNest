import java.util.Scanner;
public class ExampleOfIfElse {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Age Of Respective Person:");
        int age=sc.nextInt();

        if(age>=18){
            System.out.println("You Can Elagible For Voting");
        }

        else{
            System.out.println("You Cannot Elagible For Voting Your Age Is Less Than 18");

        }

    }
    
}



                        /*output:-
                          compile Time = Success
                          Run Time = Sucess

                          1.  Enter Age Of Respective Person:
                              22
                              You Can Elagible For Voting

                         2.    Enter Age Of Respective Person:
                               17
                               You Cannot Elagible For Voting Your Age Is Less Than 18

                     */
