public class PrintNumberEven {
        public static void main(String[]args){
            int a=125462433;
            int even=0;
            int odd=0;
            
            do{
                int r=a%10;
                if(r%2==0){
                    System.out.println("Even Number="+r);
                    even++;
                }
                else{
                    System.out.println("Odd Number="+r);
                    odd++;
                }
                a=a/10;
                

            }while(a>0);
            System.out.println("Count Odd Number="+odd);
            System.out.println("Count Even Number="+odd);
        }
        
    }
    
    
                        /*output:-
                          compile Time = Success
                          Run Time = Sucess
                          Odd Number=3
                          Odd Number=3
                          Even Number=4
                          Even Number=2
                          Even Number=6
                          Even Number=4
                          Odd Number=5
                          Even Number=2
                          Odd Number=1
                          Count Odd Number=4
                          Count Even Number=4
                          */
