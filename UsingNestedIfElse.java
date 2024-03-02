import java.util.Scanner;
public class UsingNestedIfElse {
        public static void main(String [] args){
    

            Scanner sc=new Scanner(System.in);
            //Use else if 

            System.out.println("Enter Percentage of Student:");
            float mark=sc.nextFloat();

            //Type cast Float to Int
            int marks=(int)mark;



            if(marks<=100 && marks>=85){
                System.out.println("A+ Grade");
            }
            else if(marks<85 && marks>=70){
                System.out.println("B+ Grade");
            }
            else if(marks<70 && marks>=60){
                System.out.println("C+ Grade");
            }
            else if(marks<60 && marks>=45){
                System.out.println("D Grade");
            }
            else if(marks<45 && marks>35){
                System.out.println("E Grade");
            }
            else if(marks<35 && marks>=0){
                System.out.println("Fail");
            }
    
    
        }
        
        
    }
    

