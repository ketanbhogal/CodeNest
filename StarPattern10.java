public class StarPattern10 {
    public static void main(String[] args) {
        int a = 1;
        // float n=(a/2);
        // int l=(int)n;
        // if(l%2==0){
        //     l=l+2;
        // }
        // else{
        //     l=l+1;
        // }
        
        // Loop for each row
        for (int i = 1; i <= 6; i++) {
            // Print spaces before stars
            for (int k = 6 - i; k > 0; k--) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= a; j++) {
                System.out.print("* ");
            }
            System.out.println();
            a = a + 2; // Increase the number of stars for the next row
        }
    }
}



//        *
//       * *
//     * * * *
//   * * * * * *
// * * * * * * * *