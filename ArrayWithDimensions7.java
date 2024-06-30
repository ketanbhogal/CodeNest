import java.util.*;
public class ArrayWithDimensions7 {
    public static void main(String[]args){
        int [][]k=new int[2][];
        k[0]=new int[2];
        k[1]=new int [3];
        k[0][0]=20;
        k[0][1]=40;
        k[1][0]=60;
        k[1][1]=80;
        k[1][2]=100;
        System.out.println(Arrays.deepToString(k));


    }
}
