import java.util.*;
public class N11659 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int arr[] = new Int[N];
        int sum=0;

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        while(M-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            for(x;x<y;x++){
                sum+=arr[x];
            }
            System.out.println(sum);
        }
    }
}
