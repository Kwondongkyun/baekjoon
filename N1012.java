import java.util.*;

public class N1012 {
	static int node[][];
	static boolean check[][];
	static int cnt;
	static int T,m,n,K;
	//				상,하,좌,우
	static int[] dx={0,0,-1,1};
	static int[] dy={-1,1,0,0};
	
	static void dfs(int x,int y) { //DFS 메소드 , 아파트 단지 배열에서 각 점을 인자로 전달
		check[x][y]=true; // 전달 된 인자는 방문했으므로 true

		for (int i = 0; i < 4; i++) {
			int cx = x + dx[i];
			int cy = y + dy[i];
			if (cx >= 0 && cy >= 0 && cx < node.length && cy < node[0].length) {
				if (!check[cx][cy] && node[cx][cy] == 1) {
					dfs(cx, cy);
				}
			}
		}		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
        T=sc.nextInt();
		for(int q=0;q<T;q++){
			m=sc.nextInt(); // 지도의 크기 n
			n=sc.nextInt();
			K=sc.nextInt();
			cnt=0;
			node = new int[m][n]; // 지도 배열
			check = new boolean[m][n]; // 지도 방문배열
			
			// 1 넣기
			for(int i=0;i<K;i++){
				int x=sc.nextInt();
				int y=sc.nextInt();
				node[x][y]=1;
			}

			// node[i].length : 10
			for(int i=0;i<node.length;i++) {
				for(int j=0;j<node[0].length;j++) {
					if(node[i][j] == 1 && !check[i][j]) {
						dfs(i,j);// 지도의 (0,0)부터 전달
						cnt++;
					}
				}
			}
			System.out.println(cnt);
		}
		sc.close();
	}
}
