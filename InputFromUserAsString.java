import java.util.Scanner;
//Import Java library util Package And Scanner Class

public class InputFromUserAsString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Create Object sc For Scanner Class

        System.out.println("Enter The Name:");
        String a = sc.next();
        
        System.out.println("Entered Name Is:" + a);
    }
}




                        /*output:-
                          compile Time = Success
                          Run Time = Sucess  
                          Enter The Name:
                          ketan
                          Entered Name Is:ketan
                     */
