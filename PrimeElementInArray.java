public class PrimeElementInArray {
    public static void main(String[]args){
        
        int[]a={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        for(int i=0;i<a.length;i++){
            int c=0;

            for(int j=2;j<a[i];j++){
                if(a[i]%j==0){
                    c++;
                }
                }
                
                if(c==0){
                System.out.println(a[i]);
            }

            }
        }
    }
    

