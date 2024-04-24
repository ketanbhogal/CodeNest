 class MainMethodOverload{
    public static void main(String[]args){
        System.out.println("From Main(String[])");
    }
    public static void main(){
        System.out.println("From main()");
    }

    public static void main(int[]args){
        System.out.println("From main(int[])");
    }

}

//There are Executed main method with (String[]args)