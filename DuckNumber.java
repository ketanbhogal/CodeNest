public class DuckNumber {
    public static void main(String[]args){
        int num=12304;
        int c=0;


        while(num>0){
            int r=num%10;
            if(r==0){
                c++;
                break;
            }

          
            num=num/10;
        }
        if(c>0){
            System.out.println("Number Is Duck Number");
        }
        else{
            System.out.println("Number Is Not Duck Number");
        }
    }
    
}
