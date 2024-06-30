import java.util.*;
public class ArrayWithDimensions6 {
    public static void main(String[]args){
        int [][][]k=new int[2][][];
        k[0]=new int [1][3];
        k[1]=new int [2][];
        k[1][0]=new int [2];
        k[1][1]=new int [1];
        k[0][0][0]=500;
        k[0][0][1]=1000;
        k[0][0][2]=1500;
        k[1][0][0]=2000;
        k[1][0][1]=2500;
        k[1][1][0]=3000;
        System.out.println(Arrays.deepToString(k));


    }
}
