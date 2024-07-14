import java.util.*;

class Battery {
    double capacity;
    String type;
    double voltage;
    String bLife;
    String charType;

    Battery(double capacity, String type, double voltage, String bLife, String charType) {
        super();
        this.capacity = capacity;
        this.type = type;
        this.voltage = voltage;
        this.bLife = bLife;
        this.charType = charType;
    }

    void displayBattery() {
        System.out.println("Capacity Is: " + this.capacity + ", Type Is: " + this.type + ", Voltage Is: " + this.voltage + ", Battery Life Is: " + this.bLife + ", Charging Type: " + this.charType);
        System.out.println();
    }
}

class Processor {
    String Processor;
    double speed;
    String gpu;
    String security;

    Processor(String Processor, double speed, String gpu, String security) {
        super();
        this.Processor = Processor;
        this.speed = speed;
        this.gpu = gpu;
        this.security = security;
    }

    void displayProcessor() {
        System.out.println("Processor Is: " + this.Processor + ", Speed Is: " + this.speed + ", GPU Is: " + this.gpu + ", Security Is: " + this.security);
        System.out.println();
    }
}

class Mobile {
    String display;
    int camera;
    String Os;
    String connectivity;
    String sensor;
    Battery battery;
    Processor processor;

    Mobile(String display, int camera, String Os, String connectivity, String sensor, double capacity, String type, double voltage, String bLife, String charType, String Processor, double speed, String gpu, String security) {
        this.display = display;
        this.camera = camera;
        this.Os = Os;
        this.connectivity = connectivity;
        this.sensor = sensor;
        this.processor = new Processor(Processor, speed, gpu, security);
        this.battery = new Battery(capacity, type, voltage, bLife, charType);
    }

    void displayMobile() {
        System.out.println("Mobile Display Is: " + this.display + ", Mobile Camera is: " + this.camera + "px, Mobile Operating System is: " + this.Os + ", Mobile Connectivity is: " + this.connectivity + ", Mobile Sensor IS: " + this.sensor);
        System.out.println();
        this.processor.displayProcessor();
        this.battery.displayBattery();
    }
}

public class Composition1 {
    public static void main(String[] args) {
        Mobile obj = new Mobile("Amoled 2X", 50, "Android 13", "5G", "Accelerometer", 3900, "Fast Charging", 3.85, "Full Day", "Fast Charging", "Snapdragon 8", 3.36, "Adreno 740", "Qualcomm Secure Processing");
        obj.displayMobile();
    }
}
