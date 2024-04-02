public class LicrealNumber {
    public static void main(String[]args){
                int num=87;
                int reverse=0;
                int i=num;
                int sum=reverse+i;
                int a=sum;
                int A=a;
                int rev=0;
                while(num>0){
                   
                      int r=num%10;
                      reverse=(reverse*10)+r;
                      num=num/10;      
                }
        
            while(a>0){
               int r=a%10;
               rev=(rev*10)+r;
               a=a/10;
            }
        
            if(rev!=A){
                System.out.println("Given number is Lychral number");
            }
            else{
                System.out.println("Given number not Lychral number");
            }
            }
        }
