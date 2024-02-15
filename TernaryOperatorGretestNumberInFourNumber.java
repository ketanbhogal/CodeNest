public class TernaryOperatorGretestNumberInFourNumber {
        public static void main(String args[]){
            int a=52;
            int b=44;
            int c=94;
            int d=64;
            //Cheak All Possiblities For Gretest Number
            //result a>b ; a>c ; c>d ; c = 94
            int result=(a>b)?((a>c)?((a>d)?a:d):((c>d)?(c):(d))):((b>c)?((b>d)?b:d):((c>d)?c:d));
            System.out.println("The Gretest Number IS:"+result);

        }
    }






                        /*output:-
                          compile Time = Success
                          Run Time = Sucess  
                          The Gretest Number IS:94
                    
                     */
