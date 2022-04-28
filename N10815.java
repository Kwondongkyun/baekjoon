import java.util.*;
public class N10815 {
    public static int binary(int num){
        int left=0;
        int right=card.length-1;
        int mid;

        while(left<=right){
            mid=(left+right)/2;
            if(card[mid]<num){
                left=mid+1;
            }
            else if(card[mid]>num){
                right=mid-1;
            }
            else{
                return 1;
            }
        }
        return 0;
    }
    static int N;
    static int card[];
    static int M;
    static int iscard[];

    public static void main(String[] k){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        card = new int[N];

        for(int i=0;i<card.length;i++){
            card[i]=sc.nextInt();
        }
        Arrays.sort(card);

        M = sc.nextInt();
        iscard = new int[M];

        for(int i=0;i<iscard.length;i++){
            iscard[i]=sc.nextInt();
        }

        for(int i=0;i<iscard.length;i++){
            int result = binary(iscard[i]);
            System.out.println(result);
        }
    }
}
