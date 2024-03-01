public class Switchusingarray {
   

        public static void main(String[]args){
            //using final we can create Fix Value
            //in the Duplicate case value are not allow
            //We can pass expression in the palce of value
            
            final int a=4;

            int daynum=3;

            //(->) Using This Symbol We an prevent Fall Through 
            
            switch(daynum){

                case 1->System.out.println("Monday");
                
                case 2->System.out.println("Tuesday");
                
                case 3->System.out.println("Wednesday");
                
                case a->System.out.println("Thursday");
                
                case 5->System.out.println("Friday");
                
                case 6->System.out.println("Saturday");
                
                case 7->System.out.println("Sunday");
                
                default->System.out.println("INVALID");
                
            }
        }
        
    }
    
    

                        /*output:-
                          compile Time = Success
                          Run Time = Sucess 
                          Wednesday 

                     */