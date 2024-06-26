public class StsticMember {
    public static void main(String[]args){
        System.out.println(ArithmaticOperation.addition(10,20));
    }

    
}
class ArithmaticOperation{
    public static int addition(int num1,int num2){
        return num1+num2;
        
    }

    public static int multiplication(int num1,int num2){
        return num1*num2;
    }

    public static int subtraction(int num1,int num2){
        return num1-num2;
    }
}
