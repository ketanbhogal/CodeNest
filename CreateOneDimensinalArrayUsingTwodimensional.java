import java.util.*;
public class CreateOneDimensinalArrayUsingTwodimensional {
    public static void main(String[]args){
        int [][]a={{10,20,30},{40,50,60,70},{80,90}};
        int len=0;
        for(int[]i:a){
            len+=i.length;
        }
        System.out.println(len);

        int [] narr=new int[len];
        int indx=0;

        for(int []i:a){
            for(int j:i){
                narr[indx++]=j;
            }
        }
        System.out.println(Arrays.toString(narr));
    }
}
