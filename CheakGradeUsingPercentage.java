public class CheakGradeUsingPercentage {
    public static void main(String[] args) {
        int marks1= 82;
        int marks2= 74;
        int marks3= 90;
        int marks4= 72;
        int marks5= 92;

        float percentage=((marks1+marks2+marks3+marks4+marks5));
        float per=((percentage/500)*100);
        // It Convert TypeCast Float into Percent
        int percent=(int) per;
        //cheking condition of marks for greter than
        //
        char grade=(percent>=90 && percent<=100) ? ('A'):(percent<90 && percent>=75) ? ('B') :(percent<75 && percent>=55) ? ('C') :(percent<55 && percent>=35) ? ('E') : ('F');
                     
        System.out.println("Grade: " + grade);
    }
}


                        /*output:-
                          compile Time = Success
                          Run Time = Sucess  
                          Grade:B
                     */