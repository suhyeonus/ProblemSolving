import java.io.*;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
	
	private static int n;
	private static char[][] graph;
	private static boolean[][] visit;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		graph = new char[n][n];
		for(int i = 0; i < n; i++) {
			String s = br.readLine();
			for(int j = 0; j < n; j++)
				graph[i][j] = s.charAt(j);
		}
		
		// 1. non-blind
		visit = new boolean[n][n];
		int answer_non = 0;
		for(int i = 0; i < n; i++) 
			for(int j = 0; j < n; j++) 
				if(!visit[i][j]) {
					BFS(i, j);
					answer_non++;
				}
		
		// 2. graph convert
		for(int i = 0; i < n; i++) 
			for(int j = 0; j < n; j++) 
				if(graph[i][j] == 'G')
					graph[i][j] = 'R';
		
		// 3. blind
		visit = new boolean[n][n];
		int answer_blind = 0;
		for(int i = 0; i < n; i++) 
			for(int j = 0; j < n; j++) 
				if(!visit[i][j]) {
					BFS(i, j);
					answer_blind++;
				}
		
		System.out.print(answer_non + " " + answer_blind);
	}
	
	private static int[] dx = {0, 0, 1, -1};
	private static int[] dy = {1, -1, 0, 0};
	private static void BFS(int x, int y) {
		Queue<int[]> q = new LinkedList<int[]>();
		q.add(new int[] {x, y});
		visit[x][y] = true;
		
		while(!q.isEmpty()) {
			int[] node = q.poll();
			for(int i = 0; i < 4; i++) {
				int nx = node[0] + dx[i];
				int ny = node[1] + dy[i];
				
				if(0<=nx && nx<n && 0<=ny && ny<n &&
				   !visit[nx][ny] &&
				   graph[node[0]][node[1]] == graph[nx][ny]) {
					q.add(new int[] {nx, ny});
					visit[nx][ny] = true;
				}
			}
		}
		
	}
}
