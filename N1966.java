import java.util.*;
public class N1966 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int T = sc.nextInt();

        while(T-->0){
            int N = sc.nextInt();   // 테스트 케이스 개수
            int M = sc.nextInt();   // 찾을 인덱스

            LinkedList<int[]> queue = new LinkedList<>();

            for(int i=0;i<N;i++){   // queue에 테스트 케이스 삽입
                queue.offer(new int[]{i, sc.nextInt()});
            }

            int cnt = 0;
            while(!queue.isEmpty()){
                int[] front = queue.poll();
                boolean isMax = true;
                
                for(int i=0;i<queue.size();i++){
                    if(front[1] < queue.get(i)[1]) {
                        queue.offer(front);
                        for(int j=0;j<i;j++){
                            queue.offer(queue.poll());
                        }
                        isMax = false;
                        break;
                    }
                }
                if(isMax==false){
                    continue;
                }
                cnt++;
                if(front[0]==M){
                    break;
                }
            }
            sb.append(cnt).append('\n');
        }
        System.out.println(sb);
    }
}