public class SmallestElementOfArray {
    public static void main(String[]args){
        int []a={10,25,46,28,78,12,3,2,45,65,48};
        int min=a[0];
        for(int i=1;i<a.length;i++){
            if(min>a[i]){
                min=a[i];
            }
        }
        System.out.println(min);
    }
}
