import java.util.*;
public class ArrayWithDimensions2 {
    public static void main(String[]args){
        int[][][]k=new int[1][2][2];
        k[0][0][0]=101;
        k[0][0][1]=201;
        k[0][1][0]=301;
        k[0][1][1]=401;
        System.out.println(Arrays.deepToString(k));


    }
}
