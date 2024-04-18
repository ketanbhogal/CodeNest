import java.util.Scanner;
public class StrongNumberUsingMethodWithReturnType {
     public static String strongNumber(int num){
        int add=0;
        
        int numcopy=num;
        while(num>0){
            int fact=1;
            
            int r=num%10;
            for(int i=1;i<=r;i++){
        
                fact=fact*i;
                
            }
            add=add+fact;
            num=num/10;
        }
        if(numcopy==add){
            return numcopy+" Is Strong Number";
        }
        else{
            return numcopy+" Is Not Strong Number";
        }
    
     }
     public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number");
        int num=sc.nextInt();
        System.out.println(strongNumber(num));
     }

    
}
