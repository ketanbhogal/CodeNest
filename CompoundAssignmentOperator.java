public class CompoundAssignmentOperator {

    //The Compound Assignment Operator Is A Combination Of The Assignment Operator And Aithmatic Operator(+=,-=,*=,/=,%=)
    //Compound Assignment Operator Is Unary Operator

    public static void main(String[]args){
        int  a=100;
        double b=50;


        // a=a+b;
        // System.out.println(a);
        //It Will Be Print Compile Time Error
      
        //Use Plus Assignment Operator
        a+=b;
        System.out.println(a);

    } 


    
}


    /*output:-
          compile Time = Success
          Run Time = Sucess  
          150
    
     */