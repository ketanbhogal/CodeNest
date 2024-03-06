public class ReverseNumberUsingDoWhile {
    public static void main(String[]args){
        int a=5464;
        int m=0;

        do{
            int r=a%10;
            
            m=(m*10)+r;
             a=a/10;
             }while(a>0);
        System.out.println(m);
    }
    
}

                        /*output:-
                          compile Time = Success
                          Run Time = Sucess
                          4645
                          */
