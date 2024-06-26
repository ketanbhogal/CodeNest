public class CopyConstructor2 {
    public static void main(String [] args){
        CopyConst obj=new CopyConst("Ketan", 20,"23/12/2003","Male");
        obj.display();

        CopyConst obj1=new CopyConst(obj);
        obj1.display();
    }
    
}
class CopyConst{
    String name;
    int age;
    String dob;
    String gender;  

    CopyConst(String name,int age,String dob,String gender){
        this.name=name;
        this.age=age;
        this.dob=dob;
        this.gender=gender;
}
CopyConst(CopyConst obj){
    this.name=obj.name;
    this.age=obj.age;
    this.dob=obj.dob;
    this.gender=obj.gender;

}

    public void display(){
        System.out.println("*************** INFORMATION *****************");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Date Of Birth: "+dob);
        System.out.println("Gender: "+gender);
        System.out.println("");

    }
}

