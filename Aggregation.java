class WhiteBoard{
    String brand="Gurjan";
    String dim="130*50";
    double price=10000;
    Marker marker;
    Duster duster;

    void displayBoard(){
        System.out.println("White Board Brand: "+this.brand+", Dimension Is "+this.dim+", Price is: "+this.price);
    }
        void addMarker(){
            marker=new Marker();

        }
        void addDuster(){
            duster=new Duster();

        }

    }
class Marker{

    String brand="Camlin";
    String type="White Board Marker";
    String color="Black";
    double price=30;

    void displayMarker(){
        System.out.println("Marker Brand Is: "+this.brand+", Marker Type Is "+this.type+",  Marker Color Is:"+this.color+", Price is: "+this.price);

    }
}
class Duster{
    String brand="polo";
    double price=30;
    String material="Plastic";

    void displayDuster(){
        System.out.println("Duster Brand Is: "+this.brand+", Price is: "+this.price+", Duster Material Is: "+this.material);

    }
}

public class Aggregation {
    public static void main(String[]args){
            WhiteBoard obj=new WhiteBoard();
            obj.displayBoard();
            obj.addMarker();
            obj.marker.displayMarker();
            obj.addDuster();
            obj.duster.displayDuster();
    }
    
}
