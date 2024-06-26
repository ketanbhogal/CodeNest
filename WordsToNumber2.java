import java.util.Scanner;
public class WordsToNumber2 
{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The String: ");
        String str=sc.next().toUpperCase();

        int op=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(i==0){
                op=ch-64;

            }
            else{
                op=op*26+(ch-64);

            }
            System.out.println(str+" : "+op);
        }
    }
    
}


/*Tress

if str=f
charAt(0)=f value of f=71
i==0{
    op=71-64;//6

}

output=6*/
