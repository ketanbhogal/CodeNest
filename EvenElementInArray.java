import java.util.*;
public class EvenElementInArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int count = 0;
        
        // First, count the number of even elements in the array
        for (int i : a) {
            if (i % 2 == 0) {
                count++;
            }
        }
        
        // Create a new array to store the even elements
        int[] b = new int[count];
        int index = 0;
        
        // Populate the new array with even elements
        for (int i : a) {
            if (i % 2 == 0) {
                b[index++] = i;
            }
        }
        
        // Print the array of even elements
        System.out.println(Arrays.toString(b));
    }
}
