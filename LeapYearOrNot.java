import java.util.Scanner;
public class LeapYearOrNot {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Year");
        int year=sc.nextInt();
        if(year%4==0){
            System.out.println("This Year Is Leap Year");
        }
        else{
            System.out.println("This Year Is Not Leap Year");
        }
    }
}


                        /*output:-
                        
                          compile Time = Success
                          Run Time = Sucess
                          Enter Year
                          2024
                          This Year Is Leap Year
                          */