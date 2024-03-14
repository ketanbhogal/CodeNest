public class LCM {
    public static void main(String[]args){
        int num1=4;
        int num2=8;
        
            int large=num1>num2?(num1):(num2);

            while(true){
                
                if(large%num1==0 && large%num2==0){
                    System.out.println("The LCM Is: "+large);
                    break;
                }




                large++;
            }
        
    }
}
