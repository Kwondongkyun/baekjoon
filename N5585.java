import java.util.*;

public class N5585 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N=1000-sc.nextInt();
        int count=0;
        int []coins = {500,100,50,10,5,1};

        for(int coin : coins){
            if(N<coin){
                continue;
            }
            count+=N/coin;
            N%=coin;
        }
        
        System.out.println(count);
        sc.close();
    }
}
