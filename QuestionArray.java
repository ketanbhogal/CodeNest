import java.util.*;
public class QuestionArray {
    public static void main(String[]args){
        int[]a={16,17,4,3,5,2};
        // int max=Integer.MIN_VALUE;
        // int indx=0;

        //     for(int i=0;i<a.length;i++){
        //         if(max<a[i]){
        //             indx=i;
        //             max=a[i];
                    
        //         }
        //     }
        
        // System.out.println(max+" "+indx);

        for(int i=0;i<a.length;i++){
            if(isLeader(a,i)){
                System.out.print(a[i]+"\t");
            }
        }
    }
    public static boolean isLeader(int[] a,int i){
        for(int j=i+1;j<a.length;j++){
            if(a[j]>a[i]){
                return false;
            }
        }
        return true;
    }
}
