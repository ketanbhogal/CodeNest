public class CoprimeNumber {
    public static void main(String[]args){
        int num1=10;
        int num2=11;
        int i=1;
        int c=0;
   
        
        int small=num1<num2?(num1):(num2);

        while(i<=small){
            if(num1%i==0 && num2%i==0){
                c++;
               
               
            }
            i++;
        }
        if(c==1){
            System.out.println("Given Number Is Coprime Number");

        }
        else{
            System.out.println("Given Number is Not Coprime Number");
        }
    }
    
}







/*output:-
                        
 compile Time = Success
 Run Time = Sucess
Given Number Is Coprime Number
*/
