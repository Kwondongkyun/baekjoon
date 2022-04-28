import java.util.*;

public class N10026 {
    static String arr[][];
    static int N;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N=sc.nextInt();

        arr=new String[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                arr[i][j]=sc.next();
            }
        }
        sc.close();
    }
}
