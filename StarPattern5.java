public class StarPattern5 {
    public static void main(String[]args){
        int a=6;
        for(int i=1;i<=6;i++){
            for(int j=1;j<=6;j++){
            if((i==3||i==4)&&(j==3||j==4)){
                System.out.print("  ");

            }
            else{
                System.out.print("* ");
            }

            }
            System.out.println();
        }
    }
    
}
  


        //    output:-
        //    * * * * * * 
        //    * * * * * * 
        //    * *     * * 
        //    * *     * * 
        //    * * * * * *
        //    * * * * * *