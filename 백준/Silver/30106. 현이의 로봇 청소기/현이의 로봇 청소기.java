import java.io.*;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;

class Main {
	
	private static int N, M, K;
	private static int[][] graph;
	private static boolean[][] visit;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		graph = new int[N][M];
		visit = new boolean[N][M];
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < M; j++)
				graph[i][j] = Integer.parseInt(st.nextToken());
		}
		
		int answer = 0;
		for(int i = 0; i < N; i++)
			for(int j = 0; j < M; j++)
				if(!visit[i][j]) {
					answer++;
					BFS(i, j);
				}
		System.out.print(answer);
	}
	
	static int[] dx = {0, 0, -1, 1};
	static int[] dy = {1, -1, 0, 0};
	
	private static void BFS(int x, int y) {
		Queue<int[]> q = new LinkedList<int[]>();
		q.add(new int[] {x, y});
		visit[x][y] = true;
		
		while(!q.isEmpty()) {
			int[] node = q.poll();
			int m = node[0];
			int n = node[1];
			
			for(int i = 0; i < 4; i++) {
				int nx = m + dx[i];
				int ny = n + dy[i];
				
				if(0 <= nx && nx < N &&
				   0 <= ny && ny < M &&
				   !visit[nx][ny] &&
				   Math.abs(graph[nx][ny] - graph[m][n]) <= K) {
					q.add(new int[] {nx, ny});
					visit[nx][ny] = true;
				}
			}
		}
	}
}