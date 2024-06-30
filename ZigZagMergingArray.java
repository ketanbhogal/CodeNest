import java.util.*;
public class ZigZagMergingArray {
    public static void main(String[]args){
        int []a={1,2,3};
        int []b={4,5,6,7,8};
//Creating New Array Using Both Array Length
        int []narr=new int [(a.length)+(b.length)];

//Creating loop which will itrate till largest array length
        for(int i=0,j=0;i<b.length;i++){

            //Cheak if index is less then i or else AIOOBE
            if(i<a.length){
                
                //Storing index zig in new array
                narr[j++]=a[i];

            }
            
            narr[j++]=b[i];
        }
        System.out.println(Arrays.toString(narr));
    }
}
