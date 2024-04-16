public class StarPattern9 {
    public static void main(String[] args) {
        int a = 15;
        float n=(a/2);
        int l=(int)n;
        if(l%2==0){
            l=l+2;
        }
        else{
            l=l+1;
        }


        for (int i = 1; i <= l; i++) {
            // Print spaces before stars
            for (int k = 1; k < i; k++) {
                System.out.print("  ");
            }

            // Print stars
            for (int j = 1; j <= a; j++) {
                System.out.print("* ");
            }
            System.out.println();
            a =a- 2; // Decrease the number of stars for the next row
        }
    }
}






// * * * * * * * * * * *
//   * * * * * * * * *
//     * * * * * * * 
//       * * * * * 
//         * * *
//           * 