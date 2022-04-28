import java.util.*;
public class N10870 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println(fibo(n));
        sc.close();
    }
    static int fibo(int x){
        if(x==0){
            return 0;
        }
        else if(x==1) return 1;

        return fibo(x-1)+fibo(x-2);
    }
}
