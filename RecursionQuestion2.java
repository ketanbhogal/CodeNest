/*There Are N Number Of Mobile Each even number mobile Has Two cameras and odd mobile has 1 camera Sent The Number Of mobile To Method And Return The
Total Number Of cameras */
import java.util.Scanner;
public class RecursionQuestion2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter mobile Number: ");
        int num= sc.nextInt();
        System.out.println(mobile(num));

    }
    public static int mobile(int num){
        if(num==0){
            return 0;

        }
        else{
            if(num%2==0){
                return (2+mobile(num-1));
            }
            else{
                return (1+mobile(num-1));
            }

        }
        
        
    }
    
}
