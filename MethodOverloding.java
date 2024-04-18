public class MethodOverloding {
    public static void add(int a,int b){
        System.out.println("Addition is: "+(a+b));

    }
    public static void add(int a,double b){
        System.out.println("Addition is: "+(a+b));
        
    }
    public static void add(int a,double b,int c){
        System.out.println("Addition is: "+(a+b+c));
        
    }
    public static void add(double a,int b){
        System.out.println("Addition is: "+(a+b));
        
    }
    public static void add(char a,char b){
        System.out.println("Addition is: "+(a+b));
        
    }
    public static void add(int a,char b){
        System.out.println("Addition is: "+(a+b));
        
    }
    public static void main(String[]args){
        add(32,12);
        add(15,29.4);
        add(15,5.4,65);
        add('a','k');
        add(5,'a');
    }
}
