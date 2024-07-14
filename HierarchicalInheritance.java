import java.util.Scanner;
class Loan{
    String bank;
    String accountHolderName;
    String accountNumber;
    String branch;
    String address;

    Loan(String bank,String accountHolderName,String accountNumber, String branch,String address){
        super();
        this.bank=bank;
        this.accountHolderName=accountHolderName;
        this.accountNumber=accountNumber;
        this.branch=branch;
        this.address=address;
    }
    void displayLoan(){
        System.out.println("LOAN [Bank Name: "+this.bank+", Account Holder Name: "+this.accountHolderName+", Account Number: "+this.accountNumber+", Branch: "+this.branch+", Address Is: "+this.address+"]");
        
    }
}
    class HomeLoan extends Loan{
        String addressHome;
        String propertyOwner;
        double Price;

        HomeLoan(String addressHome, String propertyOwner,double Price,String bank,String accountHolderName,String accountNumber, String branch,String address){
            super(bank,accountHolderName,accountNumber,branch,address);
            this.addressHome=addressHome;
            this.propertyOwner=propertyOwner;
            this.Price=Price;

        }
        void displayHomeLoan(){
            System.out.println("HomeLone [Address Of Home: "+this.addressHome+", Property Owner Name: "+this.propertyOwner+", Price Of Home: "+this.Price+"]");
        }
    }

    class CarLoan extends Loan{
        String brand;
        String model;
        double price;

        CarLoan(String brand,String model, double price,String bank,String accountHolderName,String accountNumber, String branch,String address){
            super(bank,accountHolderName,accountNumber,branch,address);
            this.brand=brand;
            this.model=model;
            this.price=price;

        }
        void displayCarLoan(){
            System.out.println("CarLone[ Brand Of Car: "+this.brand+", Model Of Car: "+this.model+", Car Price: "+this.price);
        }
    }
    class EducationLoan extends Loan{
        String education;
        int period;
        String collegeName;
        double fees;
        String eAddress;

        EducationLoan(String education,int period,String collegeName,double fees,String eAddress,String bank,String accountHolderName,String accountNumber, String branch,String address){
            super(bank, accountHolderName, accountNumber, branch, address);
            this.education=education;
            this.period=period;
            this.collegeName=collegeName;
            this.fees=fees;
            this.eAddress=eAddress;
        }
        void displayEducation(){
            System.out.println("Education Loan [ Education: "+this.education+", Period Of Loan: "+this.period+", College Name: "+this.collegeName+", Fees: "+this.fees+", Address Of College: "+this.eAddress+"]");

        }
    }



public class HierarchicalInheritance {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Option: 1:HomeLoan 2:CarLoan 3:EducationLoan 4:Exit ");
        int a=sc.nextInt();
        

        switch(a){
            case 1:{
                HomeLoan obj=new HomeLoan("karvenagar", "Ramesh", 1500000, "HDFC Karvenagar","Suresh", "8457964545", "Hinjavadi", "12A Hinjavadi");
                obj.displayHomeLoan();
                obj.displayLoan();
                System.out.println();
                break;
            }
            case 2:{
                CarLoan obj=new CarLoan("Hundai", "Creata", 1400000, "SBI Junner", "MAHESH", "6542315496", "Junner", "Junner Mumbai");
                obj.displayCarLoan();
                obj.displayLoan();
                System.out.println();
                break;
            }
            case 3:{
                    EducationLoan obj=new EducationLoan("Engineering", 4,"COEP PUNE", 150000,"PUNE", "AXIS BANK", "Ganesh", "85698569456", "SWARGATE","Hadapsar Pune");
                    obj.displayEducation();
                    obj.displayLoan();
                    System.out.println();
                    break;

            }
            case 4:{
                System.exit(0);
            }
        }
    

    }
}
