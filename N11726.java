import java.util.*;
public class N11726 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int d[]=new int[N+2];
        d[1]=1;
        d[2]=2;

        for(int i=3;i<=N;i++){
            d[i]=(d[i-2]+d[i-1])%10007;
        }
        System.out.println(d[N]%10007);
        sc.close();
    }
}
