import java.util.*;
//import java.util.Arrays;

public class N11399 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int []p=new int[N];
        for(int i=0;i<N;i++){
            p[i]=sc.nextInt();
        }
        Arrays.sort(p);
        int sum=0;
        
        for(int i=0;i<N;i++){
            for(int j=0;j<i+1;j++){
                sum+=p[j];
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
