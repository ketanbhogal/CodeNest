class School{
    String name="Piyush";
}
public class CheakSuperAndThisCall extends School {
    String name="Ramesh";
    public static void main(String[]args){
        CheakSuperAndThisCall obj=new CheakSuperAndThisCall();
        obj.home();
    }
    public void home(){
        String name="Pappu";
        System.out.println("Local: "+name);
        System.out.println("child: "+this.name);
        System.out.println("Parent: "+super.name);

        
    }
}
