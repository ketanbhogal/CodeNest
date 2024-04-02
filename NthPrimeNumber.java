public class NthPrimeNumber {
    public static void main(String[] args) {
        int n1 = 5; // First number
        int n2 = 2; // Second number
        int count; // Initialize count for prime numbers
        int c = 0; // Initialize count for prime numbers between n2 and n1
        boolean isN1Prime = true; // Flag to track if n1 is prime or not

        // Check if n1 is not a prime number
        for (int i = 2; i < n1; i++) {
            if (n1 % i == 0) {
                isN1Prime = false;
                break;
            }
        }

        // If n1 is not a prime number, print the message and exit
        if (isN1Prime==false) {
            System.out.println("Given number is not prime");
            return;
        }

        while (n2 <= n1) {
            int i = 2; // Reset i for each n2
            count = 0; // Reset count for each n2

            while (i < n2) {
                if (n2 % i == 0) {
                    count++;
                    break; // If divisible, not prime, break the loop
                }
                i++;
            }

            if (count == 0 && n2 != 1) { // Check if n2 is prime and not 1
                c++; // Increment count for prime numbers between n1 and n2
            }

            n2++; // Move to the next number
        }
        if (c == 0) {
            System.out.println("Given number is not prime");
        } else {
            System.out.println("Given number is prime");
            System.out.println("Position of the given prime number is " + c);
        }
    }
}
