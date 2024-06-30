import java.util.*;

public class UsingLoopPrint2DArray {
    public static void main(String[] args) {
        int [][]a = {{10, 20, 30, 40}, {50, 60, 70, 80, 90}};
        
        // Using for loop
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println(a[i][j]);   
            }
            System.out.println();
        }

        System.out.println("***********************************************");

        // Using while loop
        int i = 0;
        while (i < a.length) {
            int j = 0; // Reset j for each new row
            while (j < a[i].length) {
                System.out.println(a[i][j]);
                j++;
            }
            System.out.println();
            i++;
        }

        System.out.println("***********************************************");

        // Using do-while loop
        i = 0;
        do {
            int j = 0;
            do {
                System.out.println(a[i][j]);
                j++;
            } while (j < a[i].length);
            System.out.println();
            i++;
        } while (i < a.length);


        // Using For-Each Loop
        for(int[]k:a){
            for(int m:k){
                System.out.println(m);
            }
            System.out.println();
        }

        // Using ToStringMethod
        for(int l=0;l<a.length;l++){
            System.out.println(Arrays.toString(a[l]));
        }
    }
}
