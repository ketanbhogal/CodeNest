import java.util.*;
public class ArrayWithDimensions3 {
    public static void main(String[]args){

        int [][][]k=new int[2][][];
        k[0]=new int[1][2];
        k[1]=new int[1][4];
        k[0][0][0]=1000;
        k[0][0][1]=2000;
        k[1][0][0]=3000;
        k[1][0][1]=4000;
        k[1][0][2]=5000;
        k[1][0][3]=6000;
        System.out.println(Arrays.deepToString(k));


    }
}
