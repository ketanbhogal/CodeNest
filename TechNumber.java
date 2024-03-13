public class TechNumber {
    public static void main(String[]args){
        int num=2025;
        int numcopy2=num;
        int numcopy=num;

        int count=0;

        do{
            num=num/10;
            count++;
            

       
        }while(num>0);
        System.out.println("Count: "+count);

        if(count%2==0){
            //Find Divisor
            int div=1;
            for(int i=1;i<=count/2;i++){
                div=div*10;
            }
            System.out.println("Divisor: "+div);

            int f_half=numcopy/div;
            //First half Number

            int s_half=numcopy%div;
            //Second half Number

            System.out.println("First Half: "+f_half);
            System.out.println("Second Half: "+s_half);

            int sum=f_half+s_half;

            int square=sum*sum;

            if(numcopy2==square){
                System.out.println("This Number Is Tech Number");
            }
            else{
                System.out.println("This Number Is Not Tech Number");
            }


        }
        else{
            System.out.println("Given Number Is Odd Digit");
        }
        

    }
    
}
