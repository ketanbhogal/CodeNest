public class EmirpNumber {
    public static void main(String[]args){
        int num=79;
        int count =0;
        int c=0;
        int rev=0;
        for(int i=2;i<num;i++){
            if(num%i==0){
                count++;
            }

        }
        if(count==0){

        while(num>0){
            int rem=num%10;
            rev=(rev*10)+rem;
            num=num/10;
        }
    

        for(int i=2;i<rev;i++){
            if(rev%i==0){
                c++;
            }

        }

        if(c==0){
            System.out.println("This Is Emirp Number");
            
        }
        else{
            System.out.println("This Is Not Emirp Number");
        }

    }
    else{
        System.out.println("This Is Not Emirp Number");

    }
}

    
}
