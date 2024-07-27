class parent1 {
    String str = "Parent"; 
}

class child1 extends parent1 {
    String str = "child"; 
}

public class VariableShadowing {
    public static void main(String[] args) {
        child1 obj = new child1();
        System.out.println(obj.str);

        // parent1 obj1 = new child1();
        // System.out.println(obj1.str);
    }
}
