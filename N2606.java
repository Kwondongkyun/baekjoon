import java.util.*;

public class N2606 {
	static int node[][]; // 그래프 배열
	static int check[]; // 방문 배열
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
		int n=sc.nextInt(); // 컴퓨터의 수
		int m=sc.nextInt(); // 연결된 컴퓨터
		
		node=new int[n+1][n+1];
		check = new int[n+1];
		for(int i=0;i<m;i++) { // 컴퓨터 연결
			int a=sc.nextInt();
			int b=sc.nextInt();
			node[a][b]=node[b][a]=1;
		}
		bfs(1);
		sc.close();
	}
    static void bfs(int start) { // BFS 
		Queue<Integer> queue = new LinkedList<>();
		
		check[start] =1;
		queue.offer(start);
		int inf = 0; // 감염 된 컴퓨터의 수
		while(!queue.isEmpty()) {
			int x = queue.poll();
			
			for(int i=1;i<node.length;i++) {
				if(node[x][i]==1 && check[i]!=1) {
					queue.offer(i);
					check[i] = 1;
					inf++;
				}
			}
		}
		System.out.println(inf); //감염된 컴퓨터 출력
	}
	
}
