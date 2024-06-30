
import java.util.*;
public class ArrayWithDimensions8 {
    public static void main(String[]args){
        int [][][]a=new int[3][2][2];
        a[0][0][0]=75;
        a[0][0][1]=58;
        a[0][1][0]=24;
        a[0][1][1]=12;
        a[1][0][0]=45;
        a[1][0][1]=98;
        a[1][1][0]=35;
        a[1][1][1]=54;
        a[2][0][0]=79;
        a[2][0][1]=23;
        a[2][1][0]=44;
        a[2][1][1]=21;
        
        System.out.println(Arrays.deepToString(a));




    }
}
