import java.util.*;
    public class UsingLoopPrint1DArray {
    public static void main(String[]args){
    int []arr={10,20,30,40,50,60};

    int l=arr.length;
    for(int i=0;i<l;i++){
        System.out.println(arr[i]);
    }
    System.out.println("***************************************************");


    int j=0;
    while(j<l){
        System.out.println(arr[j]);
        j++;
    }
    System.out.println("***************************************************");


    int k=0;
    do{
        System.out.println(arr[k]);
        k++;
    }while(k<l);
    System.out.println("***************************************************");


    for(int m:arr)
    System.out.println(m);
}
}

    

