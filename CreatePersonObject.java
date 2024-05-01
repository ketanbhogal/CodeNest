class Person{
   String name;
   double height;
    double weight;
    String gender;

}
public class CreatePersonObject {
    public static void main(String[]args){
        Person p1=new Person();

        System.out.println(p1.name);
        System.out.println(p1.height);
        System.out.println(p1.weight);
        System.out.println(p1.gender);
        System.out.println("***************************\n");

        p1.name="Ketan";
        p1.height=5.8;
        p1.weight=56;
        p1.gender="male";

        System.out.println(p1.name);
        System.out.println(p1.height);
        System.out.println(p1.weight);
        System.out.println(p1.gender);
        System.out.println("***************************\n");

        Person p2=new Person();
        p2.name="Avinash";
        p2.height=6.0;
        p2.weight=60;
        p2.gender="male";

        System.out.println(p2.name);
        System.out.println(p2.height);
        System.out.println(p2.weight);
        System.out.println(p2.gender);
        System.out.println("***************************\n");




    }
    
}
