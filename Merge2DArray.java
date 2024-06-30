import java.util.*;
public class Merge2DArray {
    public static void main(String[]args){
        int [][]a={{10,20,30,40,50},{60,70,80,90,100}};
        int [][]b={{11,21,31,41},{51,61,71}};
        int len=0;
        for(int[]i:a){
            len+=a.length;
        }
        System.out.println(len);
       
    }
}
