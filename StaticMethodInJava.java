class Demo{
    public static void test(){
        System.out.println("Hiiii From test()");

    }
}

public class StaticMethodInJava {
    public static void main(String[]args){
        // test(); // Give CTE
        Demo.test();//We Can Call Method With The Help Of Class Name as a Refrance
    }
    
}
