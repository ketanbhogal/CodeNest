import java.util.Scanner;
public class WordsToNumber {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Word: ");
        String str=sc.next();
        System.out.println(str+" = "+calculateNumber(str));
    


    }
    public static int calculateNumber(String str){
        int count=0;
        int number=0;
        while(str!=""){
            char last=str.charAt(str.length()-1);
            int pow=(int)Math.pow(26,count);
            number=number+pow*((int)last-64);
            str=str.substring(0,str.length()-1);
            count++;
        }
        return number;
    }
    
}
