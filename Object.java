class ObjectDriver{
    String name;
    String nplace;
    String branch;
    int yop;
    double cgpa;
    long contNumber;

    public void displayInfo(){
        System.out.println(" ************* Student Info ************");
        System.out.println("Name: "+name);
        System.out.println("contNumber: "+contNumber);
        System.out.println("Native Place: "+nplace);
        System.out.println("Year Of Passout:"+yop);
        System.out.println("Branch: "+branch);
        System.out.println("CGPA: "+cgpa);
    }
}
public class Object {
    public static void main(String[] args) {
        ObjectDriver obj=new ObjectDriver();
        obj.nplace="Pune";
        obj.branch="Computer Science";
        obj.cgpa=8.5;
        obj.contNumber=8975856455l;
        obj.name="Chaitanya";
        obj.yop=2025;

        obj.displayInfo();

        ObjectDriver obj1=new ObjectDriver();
        obj1.nplace="Nagar";
        obj1.branch="Information Technology";
        obj1.cgpa=8.7;
        obj1.contNumber=7558856551l;
        obj1.name="Ketan";
        obj1.yop=2025;

        obj1.displayInfo();
    }


    
}
