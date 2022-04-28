import java.util.*;
public class N2217 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int roops[] = new int[N];
        int wt[] = new int[N];
        for(int i=0;i<roops.length;i++){
            roops[i]=sc.nextInt();
        }
        Arrays.sort(roops);
        for(int i=0;i<roops.length;i++){
            for(int j=i;j<roops.length;j++){
                if(roops[i]<=roops[j]){
                    wt[i]+=roops[i];
                }
            }
        }
        Arrays.sort(wt);
        System.out.println(wt[wt.length-1]);
        sc.close();
    }
}
