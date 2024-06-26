import java.util.Scanner;
public class StaticKeyword {

     static Scanner sc=new Scanner(System.in);
    static int num=sc.nextInt();

    static{
        System.out.println(isEvenOdd()?num+" Is Even":num+" Is odd");
        System.exit(0);
    }
        public static boolean isEvenOdd(){
            if(num%2==0){
                return true;
            }
            else{
                return false;
            }

        }
    }

