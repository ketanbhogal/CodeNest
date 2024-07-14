class College{
    String cName;
    int cId;
    String cGrade;
    
    College( String cName,int cId, String cGrade){
        this.cName=cName;
        this.cGrade=cGrade;
        this.cId=cId;
    }

    public void displayCollege(){
        System.out.println("College [College Name: "+this.cName+", College Id Is: "+this.cId+", College Grade Is: "+cGrade+"]");
        System.out.println();
    }

}
class Department extends College{
    String dName;
    int dId;
    String hodName;

    Department(String dName,int dId,String hodName,String cName,int cId, String cGrade){
        super(cName, cId, cGrade);
        this.dName=dName;
        this.hodName=hodName;
        this.dId=dId;
    }

    public void displayDepartment(){
        System.out.println("Department [Department Name: "+this.dName+", Department Id Is: "+this.dId+", Department Hod Name Is: "+this.hodName+"]");
        System.out.println();

    }
}
class Student extends Department{
    String sName;
    int sId;
    double cgpa;

    Student(String sName,int sId, double cgpa,String dName,int dId,String hodName,String cName,int cId, String cGrade){
        super(dName, dId, hodName, cName, cId, cGrade);
        this.sName=sName;
        this.sId=sId;
        this.cgpa=cgpa;
    }

    
    public void displayStudent(){
        System.out.println("Student [Student Name: "+this.sName+", Student Id Is: "+this.sId+", Student CGPA Is: "+this.cgpa+"]");
        System.out.println();

    }

}
public class MultilevelInheritance {
    public static void main(String[] args) {
        Student obj=new Student("Ramesh", 444, 8.9, "Information Technology", 325123, "Dr.SureshKumar Singh", "IIT Bombay", 12456378, "A+");
        obj.displayCollege();
        obj.displayDepartment();
        obj.displayStudent();
        
    }
}
