public class EvilNumber {
    public static void main(String[]args){
        int num=1001001;
        int count=0;


        while(num>0){
            int rem=num%10;
            if(rem==1){
                count++;
            }
            num=num/10;

        }
        if(count%2==0){
            System.out.println("Given Number Is Evil");
        }
        else{
            System.out.println("Given Number Is Not Evil");
        }
    }
    
}



// output:-

// Given Number Is Not Evil
