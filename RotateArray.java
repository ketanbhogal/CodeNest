import java.util.Scanner;
import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rotation: ");
        int r = sc.nextInt();
        System.out.println("Enter side clockwise=1,anticlockwise=2: ");
        int s = sc.nextInt();
        int[] a = { 4, 2, 1, 3, 5 };
        if(s==1){
            clockwise(a,r);
        }
        else{
            anticlockwise(a,r);
        }
        

        
    }


public static void clockwise(int[] a, int r) {

    System.out.println(Arrays.toString(a));

    for (int i = 1; i <= r; i++) {
        int temp = a[0];
        for (int j = 1; j < a.length; j++) {

            a[j - 1] = a[j];
        }

        a[a.length - 1] = temp;
    }

    System.out.println(Arrays.toString(a));

}

public static void anticlockwise(int[] a, int r) {

    System.out.println(Arrays.toString(a));

    for (int i =0; i < r; i++) {
        int temp = a[a.length - 1];
        for (int j = a.length-2; j>=0; j--) {

            a[j+1]=a[j];
        }

        a[0] = temp;
    }

    System.out.println(Arrays.toString(a));

}
}
