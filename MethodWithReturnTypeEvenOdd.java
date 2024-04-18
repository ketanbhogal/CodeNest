import java.util.Scanner;
// public class MethodWithReturnTypeEvenOdd {
//     public static String evenOdd(int num){
//         if(num%2==0){
//             return num+" is Even Number";
//         }
//         else{
//             return num+" is Odd Number";
//         }


//     }
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter The Number: ");
//         int num=sc.nextInt();
//         System.out.println(evenOdd(num));

//     }
    
// }


// ************************************************************* SECOND METHOD ****************************************************************


public class MethodWithReturnTypeEvenOdd {
    public static int evenOdd(int num){
        return num%2;
    }
    public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter The Number: ");
            int num=sc.nextInt();
            if(evenOdd(num)==0){
                System.out.println(num+" Is Even Number");
            }
            else{
                System.out.println(num+" Is Odd Number");
            }
        }

}