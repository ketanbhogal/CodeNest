public class EvilByConvertingToBinary {
    public static void main(String[]args){
        int num=34;
        int n=num;
        int binary=0;
        int count=0;
        int a=1;

        while(n>0){
            int rem=n%2;
            if(rem==1){
                count++;
            }
            binary=binary+(rem*a);
            a=a*10;
            n=n/2;
        }
        System.out.println(binary);
        if(count%2==0){
            System.out.println("Given Number Is Evil");
        }
        else{
            System.out.println("Given Number Is Not Evil");
        }
    }
    
}
