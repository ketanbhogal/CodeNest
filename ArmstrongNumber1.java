public class ArmstrongNumber1 {
    public static void main(String[] args) {
        int num = 153;
        int numcopy = num;
        int count = 0;

        // Count the number of digits in the given number
        while (numcopy > 0) {
            count++;
            numcopy = numcopy / 10;
        }

        numcopy = num;
        int result = 0;

        // Calculate the Armstrong number

        while (numcopy > 0) {
            int base = numcopy % 10;
            int product = 1;
            
            // Calculate digit raised to the power of count

            for(int i = 0; i < count; i++) {
                product =product* base;
            }

            result =result+ product;
            numcopy =numcopy/10;
        }

        // Check if the result is equal to the original number
        if (num == result) {
            System.out.println("Given Number Is Armstrong Number");
        } else {
            System.out.println("Given Number Is Not Armstrong Number");
        }
    }
}



/*output:-
                        
 compile Time = Success
 Run Time = Sucess

Given Number Is Armstrong Number
 */
