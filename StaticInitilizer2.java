public class StaticInitilizer2 {
    static int i;
    static{
        i=add(20,30);

    }
    public static void main(String[]args){
        System.out.println(i);
        int result=add(i,i);
        System.out.println(result);
    }
    public static int add(int a,int b){
        return a+b;
    }
    
}
// in this programm thir are firstly executed the static block
//
// then go to the main method and then print i value ==> 50
// and then call the add method and return the a+b===> 100