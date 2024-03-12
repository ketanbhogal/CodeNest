public class ArmstrongNumber {
    public static void main(String[]args){
    int base=4;
    int power=4;
    int ans=1;
    for(int i=1;i<=power;i++){
         ans=ans*base;
    }
    System.out.println(ans);

    }
}

/*output:-
                        
 compile Time = Success
 Run Time = Sucess

 256
 */
