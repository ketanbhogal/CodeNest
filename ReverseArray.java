public class ReverseArray {
    
        public static void main(String[] args) {
            int[] a = { 0,1, 2, 3};
            int len = a.length;
            int end=len-1;
            for (int i = 0; i <=end/2; i++) {
                int temp = a[i];
                a[i] = a[end- i];
                a[end- i] = temp;
            }
            for(int i=0;i<len;i++){
                System.out.println(a[i]);
            }
            // System.out.println(a[i]);
    
            
        }
    
    }
    
    

