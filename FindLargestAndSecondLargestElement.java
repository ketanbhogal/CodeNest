import java.util.*;
public class FindLargestAndSecondLargestElement {
    public static void main(String[]args){
        int[]a={10,20,3,5,45,65,124,88,45,65,4215,3265,898,7565};
        int temp=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i]<a[j]){
                     temp=a[i];
                     a[i]=a[j];
                     a[j]=temp;

                }
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println("Largest Number: "+(a[a.length-1]));
        System.out.println("Second Largest Number: "+(a[a.length-2]));

    }
}
