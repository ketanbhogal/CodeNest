public class StarPattern3 {
    public static void main(String[]args){
                
                int a=6;
               for (int i=1; i<=6; i++){
                   for(int j=1; j<=6; j++){
                       if (j==(a-i+1) || i == 1 || j==1 || i==6 || j==6 || i==j){
                           System.out.print(" * ");
                       } else{
                           System.out.print("   ");
                       }
                   }
                   System.out.println();
                }
           }
        }
