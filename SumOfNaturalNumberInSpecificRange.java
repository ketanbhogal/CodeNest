public class SumOfNaturalNumberInSpecificRange {
    public static void main(String[] args) {
        int a = 6;
        int b = 10;

        // Calculate the sum of natural numbers from 1 to 'a-1'
        int sumA = a*(a - 1) / 2;

        // Calculate the sum of natural numbers from 1 to 'b'
        int sumB = b * (b + 1) / 2;

        // Calculate the sum within the range from 'a' to 'b'
        int sumInRange = sumB - sumA;

        System.out.println("Sum of natural numbers from " + a + " to " + b + " is: " + sumInRange);
    }
}




    /*output:-
          compile Time = Success
          Run Time = Sucess  
          Sum of natural numbers from 6 to 10 is: 40
    
     */

