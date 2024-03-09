public class EvenMultiplesOf3And5 {
    public static void main(String[]args){
        int a=1;
        do{
        if(a%3==0&&a%5==0){
            if(a%2==0){
                System.out.println(a);
            }

        }
        a++;
    }while(a<=200);
}
}



                        /*output:-
                        
                          compile Time = Success
                          Run Time = Sucess
                          30
                          60
                          90
                          120
                          150
                          180
                          */
