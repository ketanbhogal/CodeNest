public class BuzzAlpabetsUsingWhile {
    public static void main(String[]args){
        int a=65;

        while(a<=90){
            if(a%7==0||a%10==7){
                char b=(char)a;
                System.out.println(b);
               
            }
            a++;
        }

    }
    
}


                        /*output:-
                          compile Time = Success
                          Run Time = Sucess
                          C
                          F
                          M
                          T
                          W
                          */