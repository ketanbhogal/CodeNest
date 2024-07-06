import java.util.Scanner; 
public class Quetion {
public static void main(String[] args) {

int n = 6;

int[] arr = {1,3,7,4,6,4};
 int pos = 3; 
 int op= solve(n, arr, pos);

System.out.println(op);

}

public static int solve(int n, int [] arr, int pos) {

int count=0;

int ele =arr[pos];

for(int i=0;i<n;i++)

if(i<pos && arr[i]>ele){
 count++;
}
else if(i>pos && arr[i]<ele) count++;

return count;
}
}
