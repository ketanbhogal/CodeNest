public class Recursion {
    public static void main(String[]args){
        mul(10,20);
    }
    public static void mul(int a,int b){
        int ans=a*b;
        System.out.println(ans);
        mul(5,5);
    }
    
}

//in Recursion method Call in its Own Method
