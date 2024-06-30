public class SecondSmallestNumber {
    public static void main(String[] args) {
        int[] a = {2, 5, 4, 6, 7, 9, 8, 4, 1, 5, 6};

        // Initialize the smallest and second smallest with the first two elements
        int small;
        int ssmall;
        if (a[0] < a[1]) {
            small = a[0];
            ssmall = a[1];
        } else {
            small = a[1];
            ssmall = a[0];
        }

        // Start the loop from the second element
        for (int i = 2; i < a.length; i++) {
            if (a[i] < small) {
                ssmall = small;
                small = a[i];
            } else if (a[i] > small && a[i] < ssmall) {
                ssmall = a[i];
            }
        }

        System.out.println("Smallest number: " + small);
        System.out.println("Second smallest number: " + ssmall);
    }
}
