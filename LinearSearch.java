public class LinearSearch {
    public static void main(String[]args){
        int []a={1,5,4,7,8,9,6,3,1};
        int target=13;
        int indx=getIndex(a,target);
        if(indx==-1){
            System.out.println("Element Is Not Found");

        }
        else{
            System.out.println("Element Is  Found At "+indx);

        }
    }
    public static int getIndex(int[]a,int target){
        for(int i=0;i<a.length;i++){
            if(a[i]==target){
                return i;
            }
        }
        return -1;
    }
}
