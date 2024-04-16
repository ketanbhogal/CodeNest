import java.util.Scanner;
public class CurrencyConversionUsingParameterisedMethod {
    public static void change(float rupees){
        Scanner sc=new Scanner(System.in);
        float doller=83.60f;
        float euro=88.68f;
        float pound=104.10f;
        float riyal=22.28f;
        System.out.println("Enter Ruppes convert in which Currency: ");
        String c=sc.nextLine();
        
        switch(c){
            case "Doller"->{
                float r=rupees/doller;
                System.out.println(rupees+" Rupees= "+r+" doller");
            }

            case "Euro"->{
                float r=rupees/euro;
                System.out.println(rupees+" Rupees= "+r+" Euro");
            }

            case "Pound"->{
                float r=rupees/pound;
                System.out.println(rupees+" Rupees= "+r+" Pound");
            }

            case "Riyal"->{
                float r=rupees/riyal;
                System.out.println(rupees+" Rupees= "+r+" Riyal");
            }
        }

    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Ruppes : ");
        float rps=sc.nextFloat();
        change(rps);
    }
}
