public class UsingIfElseBloodDonation {
    public static void main(String[]args){
        int age=20;
        int hemoglobin=13;
        boolean disease=false;
        boolean drugaddict=false;

        if(age>18 && age<60){

            if(hemoglobin>=13){

                if(disease==false){

                    if(drugaddict==false){
                        System.out.println("!!! You Are Elagible For Blood Donation !!!");
                    }
                    else{
                        System.out.println("!!! You Are Not Elagible For Blood Donation  Because You Have DrugAddict!!!");
                    }
                }
                else{
                    System.out.println("!!! You Are Not Elagible For Blood Donation  Because You Have Disease!!!");
                }

            }
            else{
                System.out.println("!!! You Are Not Elagible For Blood Donation  Because Your Hemoglobin Is Less Than 13!!!");
            }
        }
        else{
            System.out.println("!!! You Are Not Elagible For Blood Donation  Because Your Age Is Not Valid !!!");
        }
    }
    
}











                        /*output:-
                          compile Time = Success
                          Run Time = Sucess

                          1)if hemoglobin is less than 13
                          !!! You Are Not Elagible For Blood Donation  Because Your Hemoglobin Is Less Than 13!!!

                          2)if age is not valid
                          !!! You Are Not Elagible For Blood Donation  Because Your Age Is Not Valid !!!

                          3)all condition is true/correct
                          !!! You Are Elagible For Blood Donation !!!

                          */