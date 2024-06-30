import java.util.*;
public class ArrayWithDimensions5 {
    public static void main(String[]args){
        int k[][][]=new int[2][][];
        k[0]=new int[2][];
        k[0][0]=new int [2];
        k[0][1]=new int [1];
        k[1]=new int [3][];
        k[1][0]=new int [1];
        k[1][1]=new int [2];
        k[1][2]=new int [3];
        k[0][0][0]=121;
        k[0][0][1]=222;
        k[0][1][0]=333;
        k[1][0][0]=444;
        k[1][1][0]=555;
        k[1][1][1]=102;
        k[1][2][0]=202;
        k[1][2][1]=303;
        k[1][2][2]=404;
        System.out.println(Arrays.deepToString(k));



    }
    
}
