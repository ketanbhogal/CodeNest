public class PerfectSquare {
    public static void main(String[]args){
        int a=6;
        int sqr=1;

      // int c=0;
        for(int i=0;sqr<=a;i++)
        {
        sqr=i*i;
        if (a==sqr)
        {
            System.out.println("the number is perfect sqr");
           // c++;
            break;

        }



        // if(sqr>a){
        //     break;
        // }
        // if(sqr==a){
        //     System.out.println("Is Perfect Square");
        //     break;
        // }
        // }
        // if(sqr!=a){
        //     System.out.println("Is  Not Perfect Square");
        // }
        
    }
    if (a!=sqr)
    {
        System.out.println("the number is not perfect number");
    }
    
}

}
