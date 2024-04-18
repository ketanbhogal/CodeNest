import java.util.Scanner;
public class StarPattern12 {

        public static void printPattern(int n)
        {
            int i, j;
            for (i = n; i>= 1; i--) {
                for (j = i; j >=1; j--) {
                    System.out.print(" * ");
                }
                System.out.println();
            }
        }
        public static void plus(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==n/2+1 || j==n/2+1){
                    System.out.print("*  ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }        
        }
        public static void diagonal(int n) {
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    if( i==j || i+j==n+1){
                        System.out.print("*  ");
                    }
                    else{
                        System.out.print("   ");
                    }
                }
                System.out.println();
            }        
            }
            public static void tringle(int n) {
                for(int i=1;i<=n;i++){
                    for(int j=1;j<=i;j++){
                        System.out.print("*  ");
                    }
                    System.out.println();
                }
                for(int i=1;i<=n-1;i++){
                    for(int j=1;j<=n-i;j++){
                        System.out.print("*  ");
                    }
                    System.out.println();
                }
                
            }
            public static void reverseTriangle(int n) {
                for(int i=1;i<=n;i++){
                    for(int j=1;j<=n-i;j++){
                        System.out.print("   ");
                    }
                    for(int k=1;k<=i;k++){
                        System.out.print("*  ");
                    }
                    System.out.println();
                }
                for(int i=1;i<=n-1;i++){
                    for(int j=1;j<=i;j++){
                        System.out.print("   ");
                    }
                    for(int k=1;k<=n-i;k++){
                        System.out.print("*  ");
                    }
                    System.out.println();
                }
            }

        public static void main(String args[])
        {
            int n = 3;
            printPattern(n);
            plus(7);
            diagonal(5);
            tringle(5);
            reverseTriangle(5);
        }
    }

