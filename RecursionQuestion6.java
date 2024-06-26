// write a java program to find a number in the digit and get the count of the found digit using method recursion

import java.util.Scanner;
public class RecursionQuestion6 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num= sc.nextInt();
        System.out.println("Enter findNumber: ");
        int fnum= sc.nextInt();
        System.out.println(count(fnum,num));

    }
    public static int count(int fnum ,int num){
        if(num<=9){
            if(fnum==num){
                return 1;
            }
            else{
                return 0;
            }
        }
        else{
            if(num%10==fnum){
                return 1+count(fnum,num=num/10);

            }
            else{
                return 0+count(fnum,num=num/10);
            }

            
        }
    }


    }

    

