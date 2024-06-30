import java.util.*;
public class PrimeNumberUsingArray {
    static int num=2;
    public static void main(String[]args){
        int []arr=new int [10];
        int indx=0;
        int count=0;
        for(;;){
            if(fetchPrimeNumber()){
                arr[indx++]=num;
                count++;
            }
            num++;
            if(count==10)
            break;
        }
        System.out.println(Arrays.toString(arr));

    }
    public static boolean fetchPrimeNumber(){
        boolean flag=true;
        for(int i=2;i<num;i++){
            if(num%2==0){
                flag=false;
                break;
            }
        }
        return flag;
    }

}
