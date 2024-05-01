import java.util.Scanner;
public class StarPattern13 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number Of Star");
        int n=sc.nextInt();
        int p=n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==j||i==1||i==n){
                
                System.out.print("  *");
                }
            
            }
                System.out.println(" ");
        }
    }
    
}
