import java.util.Scanner;
public class SutaiableOrNot {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Tempreture: ");
        int temp=sc.nextInt();
        if(temp>25 && temp%5==0 && temp%7==0){
            System.out.println("Tempreture Is Sutaible For Making House");
        }
        else{
            System.out.println("Tempreture Is Not Sutaible For Making House");
        }

    }
    
}








                        /*output:-
                        
                          compile Time = Success
                          Run Time = Sucess
                          
                          Enter Tempreture: 
                          35
                          Tempreture Is Sutaible For Making House

                          */