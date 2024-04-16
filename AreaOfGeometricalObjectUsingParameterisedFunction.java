import java.util.Scanner;
public class AreaOfGeometricalObjectUsingParameterisedFunction {

    public static void rectangle(int height,int width){
        System.out.println("Area Of Rectangle: "+(height*width));
    }

    public static void circle(int r){
        System.out.println("Area Of Circle: "+(3.14*r*r));
    }

    public static void triangle(int height,int base){
        System.out.println("Area Of Triangle: "+(0.5*base*height));
    }

    public static void cylinder(int r,int h){
        System.out.println("Area Of Cylinder: "+((2*3.14*r*h)+(2*3.14*r*r)));
    }

    public static void sphere(int r){
        System.out.println("Area Of Sphere: "+(4*3.14*r*r));
    }

    public static void hemisphere(int r){
        System.out.println("Area Of Hemisphere: "+(2*3.14*r*r));
    }

    public static void square(int s){
        System.out.println("Area Of Square: "+(s*s));
    }



    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Which Area You Want To Find: ");
        String i=sc.nextLine();
        switch(i){
            case "r"->{
                System.out.println("Enter Length: ");
                int l=sc.nextInt();
                System.out.println("Enter Width ");
                int w=sc.nextInt();
                rectangle(l,w);

            }

            case "t"->{
                System.out.println("Enter height: ");
                int h=sc.nextInt();
                System.out.println("Enter base ");
                int b=sc.nextInt();
                triangle(h,b);

            }

            case "c"->{
                System.out.println("Enter Radius: ");
                int r=sc.nextInt();
              
                circle(r);

            }

            case "cy"->{
                System.out.println("Enter Radius: ");
                int r=sc.nextInt();
                System.out.println("Enter Height: ");
                int h=sc.nextInt();
              
                cylinder(r,h);

            }

            case "s"->{
                System.out.println("Enter Radius: ");
                int r=sc.nextInt();
              
                sphere(r);

            }

            case "h"->{
                System.out.println("Enter Radius: ");
                int r=sc.nextInt();
              
                hemisphere(r);

            }

            case "sq"->{
                System.out.println("Enter Side: ");
                int s=sc.nextInt();
              
                square(s);

            }
        }

    }


    
}
