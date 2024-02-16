import java.util.Scanner;
//Import Java library util Package And Scanner Class

public class InputFromUserAsFloat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Create Object sc For Scanner Class

        System.out.println("Enter The Number:");
        float a = sc.nextFloat();
        
        System.out.println("Entered Number Is:" + a);
    }
}




                        /*output:-
                          compile Time = Success
                          Run Time = Sucess  
                          Enter The Number:
                          45.25
                          Entered Number Is:45.25
                     */
