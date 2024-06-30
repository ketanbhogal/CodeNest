import java.util.*;
public class MergeTwoDArray {
    public static void main(String[]args){
        int [][]a={{10,20,30,40,50},{60,70,80,90,100}};
        int [][]b={{11,21,31,41},{51,61,71}};
        int indx=0;
        int [][]c=new int[a.length+b.length][];
        for(int i=0;i<a.length;i++){
            c[indx]=new int[a[i].length];
            for(int j=0;j<a[i].length;j++){
                c[indx][j]=a[i][j];
            }
            indx++;
        }
        for(int i=0;i<b.length;i++){
            c[indx]=new int[b[i].length];
            for(int j=0;j<b[i].length;j++){
                c[indx][j]=b[i][j];
            }
            indx++;
        }
        System.out.println(Arrays.deepToString(c));

    }
}
