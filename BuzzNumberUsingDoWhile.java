public class BuzzNumberUsingDoWhile {
    public static void main(String[]args){
        int a=1;
        do{

            //cheak condition for buzz number
            if(a%7==0||a%10==7){
            System.out.println(a);
            }
            a++;

        }while(a<=30);

    }
    
}




                        /*output:-
                          compile Time = Success
                          Run Time = Sucess
                          7
                          14
                          17
                          21
                          27
                          28
                          */
