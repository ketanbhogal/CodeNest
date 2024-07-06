import java.util.Scanner;

public class AtmSystemUsingEncapsulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("******************** ..... Cheak Your Bank Balance ..... ******************\n\n");

        System.out.print("Enter Your PIN: ");
        int pin = sc.nextInt();
        
        Demo d = new Demo();
        double balance = d.getBalance(pin);
        
        if (balance != -1) {
            System.out.println("Your Bank Balance Is: " + balance);
        } else {
            System.out.println("Incorrect PIN.");
        }
    }
}

class Demo {
    private double balance = 20000d;
    private final int pin = 1234; // For example purposes, a fixed PIN.

    public double getBalance(int pinInput) {
        if (this.pin == pinInput) {
            return balance;
        } else {
            return -1; // Returning -1 to indicate incorrect PIN.
        }
    }
}
