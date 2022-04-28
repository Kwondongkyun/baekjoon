import java.util.*;
public class N11724 {
    static int N;
    static int M;
    static int graph[][];
    static boolean checked[];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N=sc.nextInt();
        M=sc.nextInt();
        graph=new int[N+1][N+1];
        checked=new boolean[N+1];

        for(int i=0;i<M;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            graph[x][y]=graph[y][x]=1;
        }
        int result=0;
        for(int i=1;i<=N;i++){
            if(checked[i]==false){
                dfs(i);
                result++;
            }
        }
        System.out.println(result);
        sc.close();
    }
    public static void dfs(int index) {
		if(checked[index] == true)
			return;
		else {
			checked[index] = true;
			for(int i = 1; i <= N; i++) {
				if(graph[index][i] == 1) {
					dfs(i);
				}
			}
		}
	}	
}