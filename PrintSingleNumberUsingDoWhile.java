public class PrintSingleNumberUsingDoWhile {
    public static void main(String[]args){
        int a=1254;
        do{
            int r=a%10;
            System.out.println(r);
            a=a/10;
            
        }while(a>0);
    }
    
}






                        /*output:-
                          compile Time = Success
                          Run Time = Sucess
                          4
                          5
                          2
                          1
                          */