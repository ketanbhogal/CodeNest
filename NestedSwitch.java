import java.util.Scanner;
public class NestedSwitch {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter Your Choice");
        int key=sc.nextInt();
        switch(key){
            case 1->{
                System.out.println("\n!!!!!!! Choose College !!!!!!!");
                System.out.println("Enter Your Choice");
                int key1=sc.nextInt();
                switch(key1){
                    case 1->{
                        System.out.println(   "\n!!!!!!!!!!! Place Of College:HomeTown !!!!!!!!!!!!!");
                        System.out.println("Enter Your Grade:");
                        String grade=sc.next();
                        System.out.println("Enter Your Marks:");
                        float per=sc.nextFloat();

                        System.out.println("Enter Your Choice");
                        int key2=sc.nextInt();
                         switch(key2){
                            case 1->{
                                if(per>=70 || grade=="A" ){
                                    System.out.println("!!!!!!!!!!!!!!! congrats you can Get College !!!!!!!!!!!!!!!!");
                                }
                                else{
                                    System.out.println("!!!!!!!!!!!!!!!!! Sorry You Cannot Get College In Your Native !!!!!!!!!!!!!!");
                                }
                            }

                            case 2->{
                                if(per>=60 || grade=="A" || grade=="B"){
                                    System.out.println("!!!!!!!!!!!!!!!!!!!!!! congrats you can Get College In India !!!!!!!!!!!!!!!");

                                }
                                else{
                                    System.out.println("!!!!!!!!!!!!!!!!!!! Sorry You Cannot Get College In India !!!!!!!!!!!!!!!!!!!");
                                }
                            }

                            case 3->{
                                if(per>=90 || grade=="A" ){
                                    System.out.println("!!!!!!!!!!! congrats you can Get College In World !!!!!!!!!!!!!!!!!!!!!");
                                }
                                else{
                                    System.out.println("!!!!!!!!!!!!!!!! Sorry You Cannot Get College In World !!!!!!!!!!!!!!!!!!!!");
                                }
                            }

                            case 4->{
                                if(per>=35 || grade=="C" ){
                                    System.out.println("!!!!!!!!!!!!!!!!! congrats you can Get College In Remote !!!!!!!!!!!!!!!!!!");
                                }
                                else{
                                    System.out.println("!!!!!!!!!!!!!!!!! Sorry You Cannot Get College In Remote !!!!!!!!!!!!!!!!!!");
                                }
                            }

                         }


                    }
                }
            }
        } 
    }
    
}
