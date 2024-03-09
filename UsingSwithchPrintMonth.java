import java.util.Scanner;
public class UsingSwithchPrintMonth {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Month Number");
        int month =sc.nextInt();
        switch(month){
            case 1->System.out.println("January");
            case 2->System.out.println("February");
            case 3->System.out.println("March");
            case 4->System.out.println("April");
            case 5->System.out.println("May");
            case 6->System.out.println("June");
            case 7->System.out.println("July");
            case 8->System.out.println("August");
            case 9->System.out.println("Septmber");
            case 10->System.out.println("Octomber");
            case 11->System.out.println("November");
            case 12->System.out.println("December");
            default->System.out.println("Enter Valid Number Of Month");
        }
    }
    
}



                        /*output:-
                        
                          compile Time = Success
                          Run Time = Sucess
                          Enter Month Number
                          12
                          December

                          */