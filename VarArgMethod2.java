public class VarArgMethod2 {
   
    public static void add(int...a){
   
            System.out.println("Hi From VarArgMethod ");
            
        
    }

    public static void add(int a,int b,int c){
        
            System.out.println("Hi From Parametric Method");
            
        

    }



    public static void main(String[]args){
        add(10,20,30,40);
        add(10);
        add(10,20,30);
        add(10,20,30,40,50,60);
    }
    
}
