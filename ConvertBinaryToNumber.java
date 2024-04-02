public class ConvertBinaryToNumber {
    public static void main(String[]args){
        int v=1101;
        int v1=0;
        int b=1;

        while(v>0){
            int rem=v%10;
            v1=v1+(b*rem);
            v=v/10;
            b=b*2;
        }
        System.out.println(v1);
        
    }
    
}




//   Output:-

//   13

