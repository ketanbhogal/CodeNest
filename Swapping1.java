import java.util.*;
public class Swapping1 {
    public static void main(String[]args){
        int []arr={2,4,6,8,9,1,3,5,7};
        int temp;
        for(int i=0;i<arr.length/2;i++){
            temp=arr[i];
            arr[i]=arr[(arr.length-1-i)];
            arr[(arr.length-1-i)]=temp;
            
        }
        System.out.println(Arrays.toString(arr));
    }
}
