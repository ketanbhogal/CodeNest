public class NarrowingTypeCast {

        //Narrowing is convert Higher Type Of Data Into Lower Type Of Data
         
         public static void main(String[]args){
            //TypeCast Byte To int
            //Implicite TypeCasting
            // int a=130;
            // byte b=a;
            // System.out.println(b);
            //It Will Be Give Compile Time Error Because It Is Losse Conversion
    
            //Explicite TypeCasting
            int a1=132;
            byte b1=(byte)a1;
            System.out.println(b1);
    
    
    
    
        }
    
}



            /*output:-
                  compile Time = Success
                  Run Time = Sucess  
                  -124
            
             */