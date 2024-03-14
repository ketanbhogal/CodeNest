public class HarshalNumber {
    public static void main(String[]args){
        int num=21;
        int numcopy=num;
        int result=0;
        while(num>0){
            int r=num%10;
            result=result+r;
            num=num/10;

        }
        if(numcopy%result==0){
            System.out.println(numcopy+" Is Harshad Number");
        }
        else{
            System.out.println(numcopy+" Is Not Harshad Number");
        }

    }
    
}
