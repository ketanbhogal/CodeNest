import java.util.Scanner;

public class DivisiblityProblem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = sc.nextInt();
        int sum = 0;

        if (num % 5 == 0 || num % 7 == 0) {
            if (num % 5 == 0) {
                int temp = num; // store the original number for later comparison
                do {
                    int r = temp % 10; // use a temporary variable to iterate through the digits
                    sum = sum + r;
                    temp = temp / 10;
                } while (temp > 0);

                if (num % sum == 0) {
                    System.out.println("Number Is Divisible By Sum");
                } else {
                    System.out.println("Number Is Not Divisible By Sum");
                }
            } else if (num % 7 == 0) {
                int rem = (num / 10) % 10; // extract the second digit from the right
                System.out.println("Alternate Number Is: " + rem);
            }
        } else {
            System.out.println("Number is not divisible by 5 or 7");
        }
    }
}
