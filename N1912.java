import java.util.*;
public class N1912 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<N;i++){
            int num = sc.nextInt();
            sum+=num;
            max=Math.max(max, sum);
            if(sum<0){
                sum=0;
            }
        }
        System.out.println(max);
    }
}
