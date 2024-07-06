import java.util.*;
public class BinarySearch {
    public static void main(String[]args){
            int [] a={1,5,4,8,9,7,6,10,2,3};
            Arrays.sort(a);

            int target=3;
            int indx=binarySearch(a,target);

            if(indx==-1){
                System.out.println("Element is not found");
            }
            else{
                System.out.println("Element is found At: "+indx);

            }
        }
            public static int binarySearch(int[]a,int target){
                int min=0;
                int max=a.length-1;

                while(min<=max){
                    int mid=min+(max-min)/2;
                    int midele=a[mid];

                    if(midele>target){
                        max=mid-1;
                    }
                    else if(midele<target){
                        min=mid+1;
                    }
                    else{
                        return mid;
                }
            }
                return-1;
            }

    }
    

