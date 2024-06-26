// write a java program to get the lcf and hcf using recursion.


public class RecursionQuestion7 {
    public static void main(String[]args){
        System.out.println("Lcm: "+lcm(14,30));
    }

        public static int hcf(int a,int b){
            if(b==0){
                return a;
            }
            else{
                return hcf(b,a%b);
            }

        }
        public static int lcm(int a,int b){
            int hcfvalue=hcf(a,b);
            System.out.println("hcf: "+hcfvalue);
            return(a/hcfvalue)*b;
        }

}