public class StarPattern7 {
    public static void main(String[]args){
        int a=10;

        for(int i=1;i<=10;i++){
            int n=a-i;
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    
}
 

// Output:-
// * * * * * * * * * *
// * * * * * * * * *
// * * * * * * * *
// * * * * * * *
// * * * * * *
// * * * * *
// * * * *
// * * *
// * *
// *