public class NeonNumber {
    public static void main(String[]args){
        int a=9;
        int b=a;
        int sum=0;
        int square=a*a;
        while(square>0){
            int r=square%10;
            sum=sum+r;
            square=square/10;
        }
        if(sum==b){
            System.out.println("Given Number Is Neon Number ");
        }
        else{
            System.out.println("Given Number Is Not Neon Number ");
        }



        
    }
    
}
