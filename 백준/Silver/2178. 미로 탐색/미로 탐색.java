import java.io.*;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
	
	static int[][] graph;
	static int[][] visit;
	static int N, M;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		graph = new int[N][M];
		for(int i = 0; i < N; i++) {
			String line = new String(br.readLine());
			for(int j = 0; j < M; j++)
				graph[i][j] = (int)(line.charAt(j)) - '0';
		}
		
		visit = new int[N][M];
		BFS(0, 0);
	} 
	
	static int[] movex = {0, 0, 1, -1};
	static int[] movey = {1, -1, 0 ,0};
	private static void BFS(int x, int y) {
		Queue<int[]> q = new LinkedList<int[]>();
		q.offer(new int[] {x, y});
		visit[x][y] = 1;
		
		while(!q.isEmpty()) {
			int[] now = q.poll();
			
			for(int i = 0; i < 4; i++) {
				int nx = now[0] + movex[i];
				int ny = now[1] + movey[i];
				
				if(0 <= nx && nx < N && 
				   0 <= ny && ny < M &&
				   visit[nx][ny] == 0 && graph[nx][ny] != 0) {
					q.offer(new int[] {nx, ny});
					visit[nx][ny] = visit[now[0]][now[1]] + 1;
				}
			}
			
			if(visit[N-1][M-1] != 0) {
				System.out.print(visit[N-1][M-1]);
				return;
			}
		}
	}
}
