import java.util.*;
public class N10610 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int sum=0;
        //String s = String.valueOf(N);
        char[] arr = String.valueOf(N).toCharArray();
        Arrays.sort(arr);
        if(arr[0]!='0'){
            System.out.println(-1);
        }
        else{
            for(int i=1;i<arr.length;i++){
                sum+=Integer.valueOf(arr[i]-48);
                if(sum%3==0){
                    for(int j=arr.length-1;j>=0;j--){
                        System.out.print(arr[j]);
                        sc.close();
                    }
                    return;
                }
                else{
                    System.out.println(-1);
                    sc.close();
                }
            }
        }
    }
}
