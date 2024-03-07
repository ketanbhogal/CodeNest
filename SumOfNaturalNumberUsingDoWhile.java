import java.util.Scanner;
public class SumOfNaturalNumberUsingDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Range For Sum of Natural Number:");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1; // starting from 1 to n

        do {
            sum=sum+i; // add current value of i to sum
            i++;      // increment i for the next iteration
        } while (i <= n); // continue until i reaches n

        System.out.println("Sum is: " + sum);
    }
}
