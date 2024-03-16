public class AutomorphicNumber {
    public static void main(String[] args) {
        int a = 6;
        int numcopy = a;
        int c = 0;
        int sqr = a * a;
        int rev = 0;
        int reverse = 0;

        while (a > 0) {
            a = a / 10;
            c++;
        }

        int i = 1;
        while (i <= c) {
            int rem = sqr % 10;
            rev = (rev * 10) + rem;
            sqr = sqr / 10;
            i++;
        }
       

        int j = 1;
        while (j <= c) {
            int r = rev % 10;
            reverse = (reverse * 10) + r;
            rev = rev / 10;
            j++;
        }
        

        if (numcopy == reverse) {
            System.out.println("Given Number Is Automorphic Number");
        } else {
            System.out.println("Given Number Is Not Automorphic Number");
        }
    }
}



/*output:-
                        
 compile Time = Success
 Run Time = Sucess

 1
Given Number Is Automorphic Number
*/
