public class Factorial {
    public static void main(String[]args){
        
        int fact=1;
        int start=2;
        while(start<=9){
            int num=start;
        
        
        while(num<=start){
            
            fact=num*fact;
            num++;
        }
        System.out.println( "Factorial of "+start+": "+fact);
        start++;
    }

    }
    
}





                        /*output:-
                        
                          compile Time = Success
                          Run Time = Sucess

                          Factorial of 3: 6
                          Factorial of 4: 24
                          Factorial of 5: 120
                          Factorial of 6: 720
                          Factorial of 7: 5040
                          Factorial of 8: 40320
                          Factorial of 9: 362880
                          
                          */