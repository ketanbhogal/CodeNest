public class CheakGread {
    public static void main(String[] args) {
        int marks = 82;
        //cheking condition of marks for greter than
        //result =82 ; (marks>=90 && marks<=100) ; (marks<90 && marks>=75) ; B
        char grade=(marks>=90 && marks<=100) ? ('A'):(marks<90 && marks>=75) ? ('B') :(marks<75 && marks>=55) ? ('C') :(marks<55 && marks>=35) ? ('E') : ('F');
                     
        System.out.println("Grade: " + grade);
    }
}


                        /*output:-
                          compile Time = Success
                          Run Time = Sucess  
                          Grade:B
                     */