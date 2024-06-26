/*There Are N Number Of Cat Each Cat Has Two Eyes Sent The Number Of Cat To Method And Return The
Total Number Of Eyes Of All Cats Have*/

import java.util.Scanner;
public class RecursionQuestion {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number Of Cats: ");
        int cat=sc.nextInt();
        System.out.printf("%d cats = %d cateyes",cat,catEyes(cat));

    }

    public static int catEyes(int cat){
        if(cat==0){
            return 0;
        }
        else{
            return 2+catEyes(cat-1);
        }
    }
    
}

// 3 cateyes
// (2+(cat3))=6
// (2+(cat2))=4
// (2+(cat1))=2
// (2+(cat0))=0



