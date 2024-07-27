import java.util.Scanner;
class Ola{
    String userName;
    double walletMoney;

    Ola(String userName,double walletMoney){
        this.userName=userName;
        this.walletMoney=walletMoney;
    }
    public void userDetails(){
        System.out.println("----------------------- User Details -----------------------------------");
        System.out.println("Username : "+userName);
        System.out.println("Wallet Money : "+walletMoney);
        System.out.println("*********************************************************************");
        System.out.println();
    }
}
class Suv extends Ola{
    String pickupLocation;
    String dropLocation;
    double farePrice;
    Suv(String pickupLocation,String dropLocation,double farePrice,String userName,double walletMoney){
        super(userName,walletMoney);
        this.pickupLocation=pickupLocation;
        this.dropLocation=dropLocation;
        this.farePrice=farePrice;
        
    }
    public void suvMessage(){
        System.out.println("----------------------- SUV Details -----------------------------------");
        System.out.println("Pick-up Location : "+pickupLocation);
        System.out.println("Drop Location : "+dropLocation);
        System.out.println("Fare Price : "+farePrice);
        System.out.println("*********************************************************************");
        System.out.println();
    }
    
}
class Mini extends Ola{
    String pickupLocation;
    String dropLocation;
    double farePrice;
    Mini(String pickupLocation,String dropLocation,double farePrice,String userName,double walletMoney){
        super(userName,walletMoney);
        this.pickupLocation=pickupLocation;
        this.dropLocation=dropLocation;
        this.farePrice=farePrice;
        
    }
    public void miniMessage(){
        System.out.println("----------------------- Mini Details -----------------------------------");
        System.out.println("Pick-up Location : "+pickupLocation);
        System.out.println("Drop Location : "+dropLocation);
        System.out.println("Fare Price : "+farePrice);
        System.out.println("*********************************************************************");
        System.out.println();
    }
    
}
class Auto extends Ola{
    String pickupLocation;
    String dropLocation;
    double farePrice;
    Auto(String pickupLocation,String dropLocation,double farePrice,String userName,double walletMoney){
        super(userName,walletMoney);
        this.pickupLocation=pickupLocation;
        this.dropLocation=dropLocation;
        this.farePrice=farePrice;
        
    }
    public void autoMessage(){
        System.out.println("----------------------- Auto Details -----------------------------------");
        System.out.println("Pick-up Location : "+pickupLocation);
        System.out.println("Drop Location : "+dropLocation);
        System.out.println("Fare Price : "+farePrice);
        System.out.println("*********************************************************************");
        System.out.println();
    }
    
}
class OlaUser extends Ola{
    OlaUser(String userName,double walletMoney){
        super(userName,walletMoney);
    }
}

class OlaDriver 
{
	OlaUser user;
	Ola o;

	public void rideSuv()
	{
		
		Suv ss=(Suv)o;
		ss.suvMessage();
		ss.userDetails();
	}

	public void rideMini()
	{
		o.userDetails();
		Mini mm=(Mini)o;
		mm.miniMessage();
	}

	public void rideAuto()
	{
		o.userDetails();
		Auto aa=(Auto)o;
		aa.autoMessage();
	}

	public static void main(String[] args) 
	{
		OlaDriver driver=new OlaDriver();

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter User Name: ");
		String userName=sc.nextLine();
		System.out.println("Enter Your Wallet Money: ");
		double walletMoney=sc.nextDouble();
		driver.user=new OlaUser(userName,walletMoney);
		int displayFlag=0;
		if(driver.user!=null)
			System.out.println("Account Creation Success "+userName);

		while(true)
		{
			

		System.out.println("WELCOME TO OLA RIDING APPLICATION*");
		System.out.println("Enter Your Options: ");
		System.out.println("1. Do you want to ride with SUV ?");
		System.out.println("2. Do you want to ride with Mini ?");
		System.out.println("3. Do you want to ride with Auto ?");
		System.out.println("4. Display Your Ride");
		System.out.println("5. Exit");
        System.out.println();

		int options=sc.nextInt();
		if(options ==1 || options==2||options==3){
			displayFlag=options;
		}
		switch(options)
		{
			case 1:
			{
				System.out.println("Enter Your Pickup Location: ");
				String pickup=sc.nextLine();
				pickup=sc.nextLine();
				System.out.println("Enter Your Drop Location: ");
				String drop=sc.nextLine();
				System.out.println("Enter Fare Price For This Booking");
				double fPrice=sc.nextDouble();
				driver.o=new Suv(pickup,drop,fPrice,userName,walletMoney);// upcasting
			}
			break;

			case 2:
			{
				System.out.println("Enter Your Pickup Location: ");
				String pickup=sc.nextLine();
				pickup=sc.nextLine();
				System.out.println("Enter Your Drop Location: ");
				String drop=sc.nextLine();
				System.out.println("Enter Fare Price For This Booking");
				double fPrice=sc.nextDouble();
				driver.o=new Mini(pickup,drop,fPrice,userName,walletMoney);
			}
			break;

			case 3:
			{
				System.out.println("Enter Your Pickup Location: ");
				String pickup=sc.nextLine();
				pickup=sc.nextLine();
				System.out.println("Enter Your Drop Location: ");
				String drop=sc.nextLine();
				System.out.println("Enter Fare Price For This Booking");
				double fPrice=sc.nextDouble();
				driver.o=new Auto(pickup,drop,fPrice,userName,walletMoney);
			}
			break;

			case 4:
			{
				if(driver.o==null){
                    System.out.println("No Such Ride Booked To Display");
                }
				else
				{
					switch (displayFlag) {
                        case 1:
                            driver.rideSuv();
                            break;
                    
                        case 2:
							driver.rideMini();
                            break;
                        case 3:
							driver.rideAuto();
                            break;
                    }
				}
			}
			break;

			case 5:
			{
				System.out.println("Thank You For Choosing Ola App :)");
				System.exit(0);
			}
			break;

			default:
			{
				System.out.println("Invalid Options!!! Dabba Fellow Are You blind Cant you see the options!");
			}
		}
		}
	}
}