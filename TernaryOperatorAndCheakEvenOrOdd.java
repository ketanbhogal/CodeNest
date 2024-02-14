public class TernaryOperatorAndCheakEvenOrOdd {
    public static void main(String[]args){
        int a=20;
        int b=44;
        int c=a+b;
        int d=c/10;
        int e=c%10;
        int f=d+e;
        //Condition Cheak And , If condition Is True Then Print "This Number Is Even" Else Print "This Number Is Odd"
        String result =f%2==0?"This Number Is Even":"This Number Is Odd";
        
      
        System.out.println(result);
    }
    
}


                /*output:-
                      compile Time = Success
                      Run Time = Sucess  
                     This Number Is Even
                
                 */
