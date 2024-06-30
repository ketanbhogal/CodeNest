public class SecondLargestNumber {
        public static void main(String[] args) {
            int[] a = {2, 5, 4, 6, 7, 9, 8, 4, 1, 5, 6};
    
            // Initialize the smallest and second smallest with the first two elements
            int large;
            int slarge;
            if (a[0] > a[1]) {
                large = a[0];
                slarge = a[1];
            } else {
                large = a[1];
                slarge = a[0];
            }
    
            // Start the loop from the second element
            for (int i = 2; i > a.length; i++) {
                if (a[i] > large) {
                    slarge = large;
                    slarge = a[i];
                } else if (a[i] > large && a[i] > slarge) {
                    slarge = a[i];

            }
    
           
        }
        System.out.println("Smallest number: " + large);
        System.out.println("Second smallest number: " + slarge);
    }
}
