import java.util.*;
public class BubblesortDecending {
    public static void main(String[]args){
        int []a={2,4,1,3};
        System.out.println(Arrays.toString(a));
        
        for(int i=a.length-1;i>=0;i--){

            for(int j=a.length-1;j>=0;j--){
                if(a[i]<a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));

    }
    
}


    

