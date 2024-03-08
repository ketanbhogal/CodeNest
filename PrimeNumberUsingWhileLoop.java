public class PrimeNumberUsingWhileLoop {
    public static void main(String[]args){
        int a=2;
        int b=55;
        int c=0;
        while(a<b){
            if(b%a==0){
                c++;
            }
            a++;
        }
        if(c==0){
            System.out.println(b+" Is Prime Number");
        }
        else{
            System.out.println(b+" Is Not Prime Number");
        }
    }
    
}







                        /*output:-
                          compile Time = Success
                          Run Time = Sucess
                          
                          55 Is Not Prime Number
                          */