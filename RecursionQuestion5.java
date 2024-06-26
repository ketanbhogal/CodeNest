// write a java program to cheak num is even or odd using recursion
 
import java.util.Scanner;

public class RecursionQuestion5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = sc.nextInt();
        sc.close();

        evenodd(num);
    }

    public static void evenodd(int num) {
        // Base case: if the number is 0, stop the recursion
        if (num == 0) {
            return;
        }

        // Check if the number is even or odd and print accordingly
        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }

        // Recursive call with the number decremented by 1
        evenodd(num - 1);
    }
}
