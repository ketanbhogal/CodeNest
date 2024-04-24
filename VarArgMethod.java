public class VarArgMethod {
    static int sum=0;
    public static void add(int...a){
        for(int i=0;i<a.length;i++){
            sum+=a[i];
            
        }
        System.out.println(sum);
    }
    public static void main(String[]args){
        add(10,20,30,40);
    }
    
}
