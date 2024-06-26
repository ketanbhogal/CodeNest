public class SingletonClass {
    static SingletonClass obj;
    private SingletonClass(){

    }
    public static SingletonClass getInstance(){
        if(obj==null){
            obj=new SingletonClass();
            return obj;
        }
        return obj;
    }
    public static void  main(String[]args){
        SingletonClass obj=getInstance();
        System.out.println(obj);
        SingletonClass obj1=getInstance();
        System.out.println(obj);
        
    }
    
}
