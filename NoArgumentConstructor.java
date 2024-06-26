public class NoArgumentConstructor {
    NoArgumentConstructor(){
        System.out.println("Hiiiii From NoArgumentConstructor()");
        int a=10;
        int b=20;
        int c=a+b;
        System.out.println(c);

    }
    public static void main(String[]args){
        new NoArgumentConstructor();//noargument constructor call by new keyward;

    }
}
