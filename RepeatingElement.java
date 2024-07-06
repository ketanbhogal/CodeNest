import java.util.*;
public class RepeatingElement {
    public static void main(String[] args) {
        int []a={1,3,4,5,1,2,2,1};
        System.out.println(Arrays.toString(a));
        for(int i=0;i<a.length;i++){
            int cnt=1;
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]&&a[i]!=0){
                    a[j]=0;
                    cnt++;
                }
            }
            if(cnt==1&&a[i]!=0){ //Unique Element
            // if(a[i]!=0){ //reapet count

                // if(cnt>1){
                System.out.println(a[i]);
                // System.out.println(a[i]+" "+cnt); //print is with count

            }
        }
    }
}
