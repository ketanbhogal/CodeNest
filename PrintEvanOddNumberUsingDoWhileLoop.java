public class PrintEvanOddNumberUsingDoWhileLoop {
        public static void main(String[]args){
            int a=0;
            do{
                if(a%2==0){
                    System.out.println(a+" This Is Even Number");
                }
                else{
                    System.out.println(a+" This Is Odd Number");
                }
                a++;
            }while(a<=10);
        }
    
}


                        /*output:-
                          compile Time = Success
                          Run Time = Sucess
                          
                          0 This Is Even Number
                          1 This Is Odd Number
                          2 This Is Even Number
                          3 This Is Odd Number
                          4 This Is Even Number
                          5 This Is Odd Number
                          6 This Is Even Number
                          7 This Is Odd Number
                          8 This Is Even Number
                          9 This Is Odd Number
                          10 This Is Even Number

                          */