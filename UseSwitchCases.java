import java.util.Scanner;
public class UseSwitchCases {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number for Case:");
        int b=sc.nextInt();
        System.out.println("Enter Number To Cheak Condition:");
        int c=sc.nextInt();
        switch(b){
            case 1->{
                if(c%2==0){
                    System.out.println("Given Number Is Even");
                }
                else{
                    System.out.println("Given Number Is Odd");
                }
            }
            case 2->{
                if(c%7==0 || c%10==7){
                System.out.println("Given Number Is Buzz");
            }
            else{
                System.out.println("Given Number Is Not Buzz");
            }
        }
        case 3->{
            if(c>0){
                System.out.println("Given Number Is Positive");

            }
            else{
                System.out.println("Given Number is Negative");

            }
        }

        case 4->{
            if(c>9 && c<100){
                System.out.println("Given Number is Two Digit");
            }
            else{
                System.out.println("Given Number Is Not Two Digit");
            }
        }

        }
    }
    
}
