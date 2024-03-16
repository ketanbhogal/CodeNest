public class HCF {
    public static void main(String[]args){
        int num1=136;
        int num2=228;
        int i=1;
        int c=0;
        int hcf=1;
        
        int small=num1<num2?(num1):(num2);

        while(i<=small){
            if(num1%i==0 && num2%i==0){
                c++;
                hcf=i;
               
            }
            i++;
        }
        System.out.println("Highest Common Factor Is: "+hcf);
        
            

        
    }
}


/*output:-
                        
 compile Time = Success
 Run Time = Sucess
Highest Common Factor Is: 4
*/