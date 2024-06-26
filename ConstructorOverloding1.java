class ConstructorOverloding1Driver{
    String name;
    String email;
    long mobileNumber;
    long altMobileNumber;
    String dob;
    String gender;
    ConstructorOverloding1Driver(String name,String email,long mobileNumber,long altMobileNumber,String dob,String gender){

        this.name=name;
        this.email=email;
        this.mobileNumber=mobileNumber;
        this.altMobileNumber=altMobileNumber;
        this.dob=dob;
        this.gender=gender;
    }
    ConstructorOverloding1Driver(String name,String email,long mobileNumber,String dob,String gender){

        this.name=name;
        this.email=email;
        this.mobileNumber=mobileNumber;
        this.dob=dob;
        this.gender=gender;
    }
    ConstructorOverloding1Driver(String name,String email,long mobileNumber,long altMobileNumber,String gender){

        this.name=name;
        this.email=email;
        this.mobileNumber=mobileNumber;
        this.altMobileNumber=altMobileNumber;
        this.gender=gender;
    }
    ConstructorOverloding1Driver(String name,String email,long mobileNumber,String gender){

        this.name=name;
        this.email=email;
        this.mobileNumber=mobileNumber;
        this.gender=gender;
    }

    public  void displayRegistration(){
        System.out.println("******************* Details **********************");
    System.out.println("Name= "+name);
    System.out.println("Email= "+email);
    System.out.println("Mobile Number= "+mobileNumber);
    System.out.println("Alternative Mobile Number= "+altMobileNumber);
    System.out.println("Date Of Birth= "+dob);
    System.out.println("Gender= "+gender);
    System.out.println("\n");
    }


    
}
public class ConstructorOverloding1 {
    public static void main(String[]args){

        ConstructorOverloding1Driver obj1=new ConstructorOverloding1Driver("Ramesh","ramesh@gmail.com",7598746588l,9856458765l,"12/5/19981","male");
        obj1.displayRegistration();

        ConstructorOverloding1Driver obj2=new ConstructorOverloding1Driver("Suresh","Suresh@gmail.com",84659887548l,7569745454l,"male");
        obj2.displayRegistration();

        ConstructorOverloding1Driver obj3=new ConstructorOverloding1Driver("Mahesh","Mahesh@gmail.com",7794541242l,"18/6/2001","male");
        obj3.displayRegistration();

        ConstructorOverloding1Driver obj4=new ConstructorOverloding1Driver("Ganesh","Ganesh@gmail.com",865465858l,"male");
        obj4.displayRegistration();
        
    }
    
}
