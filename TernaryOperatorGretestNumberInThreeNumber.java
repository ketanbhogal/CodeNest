public class TernaryOperatorGretestNumberInThreeNumber {
 
        public static void main(String[]args){
            int a=20;
            int b=44;
            int c=94;
            //Cheak Both Three Condition Which Condition Is True Then Print Suggested Output
            int result=a>b? (a>c?a:c):(b>c?b:c);
            System.out.println("The Gretest Number IS:"+result);
        }
        
    }
    
    
                    /*output:-
                          compile Time = Success
                          Run Time = Sucess  
                          The Gretest Number IS:94
                    
                     */

    
    

