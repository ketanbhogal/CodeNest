class College{
    String name;
    String address;
    long phone;
    String university;

    College(){

    }

    College(String name){
        this.name=name;
    }

    College(String name,String address){
        this.name=name;
        this.address=address;
    }

    College(String name,String address,long phone){
        this.name=name;
        this.address=address;
        this.phone=phone;
    }

    College(String name,String address,long phone,String university){
        this.name=name;
        this.address=address;
        this.phone=phone;
        this.university=university;
    }

    public void displayCollege(){
        System.out.println(name);
        System.out.println(address);
        System.out.println(phone);
        System.out.println(university);
        System.out.println("**********************************************************");


    }
}

public class ConstructorOverloding2 {
    public static void main(String[]args){
        College c1=new College();
        c1.displayCollege();

        College c2=new College("COEP");
        c2.displayCollege();

        College c3=new College("MIT","Pune");
        c3.displayCollege();

        College c4=new College("IIT","GOA",8845898512L);
        c1.displayCollege();

        College c5=new College("NIT","BOMBAY",6545213652L,"SSPU");
        c5.displayCollege();
    }
    
}
