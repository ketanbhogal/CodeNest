public class HappyNumber {
    public static void main(String[]args){
        int num=25;
        int numcopy=num;
        int sum=0;
        
        while(num>9||sum>9){
            if(num==0){
                num=sum;
                sum=0;
            }


        while(num>0){
            int r=num%10;
            sum+=r*r;
            num=num/10;
            

        }
        System.out.println(sum);
        
    }
        if(sum==1){
            System.out.println(numcopy+" Is Happy Number");
        }
        else{
            System.out.println(numcopy+" Is Not Happy Number");
        }
}
    
}


/*output:-
                        
 compile Time = Success
 Run Time = Sucess
 
29
85
89
145
42
20
4
25 Is Not Happy Number
*/