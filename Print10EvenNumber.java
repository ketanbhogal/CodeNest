public class Print10EvenNumber {
    public static void main(String[]args){
        int num=0;
        int pr=0;
        while(true){
          if(num%2==0){
            pr++;
            //Increase Value of j

            System.out.println(num);
            //print value of i
          }
          num++;
          if(pr==10){
            //if j==10 then break this while loop
            break;
          }
        }
    }
    
}



                        /*output:-
                        
                          compile Time = Success
                          Run Time = Sucess

                          0
                          2
                          4
                          6
                          8
                          10
                          12
                          14
                          16
                          18
                          */