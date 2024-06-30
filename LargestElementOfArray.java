public class LargestElementOfArray {
    public static void main(String[]args){
        int []a={12,45,66,88,11,121,652,32,7855,2155,1221,58555};
        int max=a[0];
        for(int i=1;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        System.out.println(max);
    }
    
    
}
