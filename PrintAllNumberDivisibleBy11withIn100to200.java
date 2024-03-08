public class PrintAllNumberDivisibleBy11withIn100to200 {
    public static void main(String[]args){
        int a=100;
        do{
            if(a%11==0){
                System.out.println(a);
                
            }
            a++;

        }while(a<=300);
    }
    
}









                        /*output:-
                          compile Time = Success
                          Run Time = Sucess
                          110
                          121
                          132
                          143
                          154
                          165
                          176
                          187
                          198
                          209
                          220
                          231
                          242
                          253
                          264
                          275
                          286
                          297
                          */