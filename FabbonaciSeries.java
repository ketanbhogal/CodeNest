public class FabbonaciSeries {
    public static void main(String[]args){
        int n=6;
        int a=0;
        int b=1;
        for(int i=0;i<=n;i++){
                int result=a+b;
                a=b;
                b=result;
                System.out.println(result);
        }

    }

    
}




/*output:-
                        
 compile Time = Success
 Run Time = Sucess

1
2
3
5
8
13
21
 */
