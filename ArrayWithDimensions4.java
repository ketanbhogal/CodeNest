import java.util.*;
public class ArrayWithDimensions4 {
    public static void main(String[]args){
    int [][]a=new int[2][];
    a[0]=new int [2];
    a[1]=new int [4];
    a[0][0]=444;
    a[0][1]=654;
    a[1][0]=494;
    a[1][1]=123;
    a[1][2]=987;
    a[1][3]=201;
    System.out.println(Arrays.deepToString(a));
    }

}
