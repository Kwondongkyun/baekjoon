import java.util.*;
public class N14502 {
    static int N;       // 세로
    static int M;       // 가로
    static int room[][];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N=sc.nextInt();
        M=sc.nextInt();
        room=new int[N][M];

        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                room[i][j]=sc.nextInt();
            }
        }
        
    }
    static void dfs(int x){
        
    }
}
