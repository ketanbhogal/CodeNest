import java.util.Arrays;

public class ThreeDArrayMerge {
    public static void main(String[] args) {
        int[][][] a = {{{1, 2, 3, 4}, {5, 6, 7}}, {{8, 9}}};
        int[][][] b = {{{10, 11, 12}}, {{13, 14, 15}}};

        // Calculate the total length of the new 3D array
        int[][][] c = new int[a.length + b.length][][];

        // Copy elements from the first 3D array 'a' to 'c'
        int indx = 0;
        for (int i = 0; i < a.length; i++) {
            c[indx] = new int[a[i].length][];
            for (int j = 0; j < a[i].length; j++) {
                c[indx][j] = new int[a[i][j].length];
                for (int k = 0; k < a[i][j].length; k++) {
                    c[indx][j][k] = a[i][j][k];
                }
            }
            indx++;
        }

        // Copy elements from the second 3D array 'b' to 'c'
        for (int i = 0; i < b.length; i++) {
            c[indx] = new int[b[i].length][];
            for (int j = 0; j < b[i].length; j++) {
                c[indx][j] = new int[b[i][j].length];
                for (int k = 0; k < b[i][j].length; k++) {
                    c[indx][j][k] = b[i][j][k];
                }
            }
            indx++;
        }

        // Print the merged 3D array
        System.out.println(Arrays.deepToString(c));
    }
}
