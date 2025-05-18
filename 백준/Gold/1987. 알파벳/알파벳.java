import java.io.*;
import java.util.StringTokenizer;
import java.util.HashMap;

public class Main {
	
	static char[][] graph;
	static boolean[][] visit;
	static HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
	
	static int answer = 0;
	static int R, C;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		String s;
		
		graph = new char[R][C];
		visit = new boolean[R][C];
		for(int i = 0; i < R; i++) {
			s = new String(br.readLine());
			for(int j = 0; j < C; j++)
				graph[i][j] = s.charAt(j);
		}
		
		DFS(0, 0, 1);
		System.out.print(answer);
	} 

	static int[] dx = {0, 0, 1, -1};
	static int[] dy = {1, -1, 0, 0};
	private static void DFS(int x, int y, int depth) {
		if(visit[x][y] || hmap.containsKey(graph[x][y])) return;
		
		visit[x][y] = true;
		hmap.put(graph[x][y], 1);
		if(depth > answer) answer = depth;
		
		for(int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(0 <= nx && nx < R &&
			   0 <= ny && ny < C &&
			   !visit[nx][ny] && !hmap.containsKey(graph[nx][ny])) {
				DFS(nx, ny, depth + 1);
				visit[nx][ny] = false;
				hmap.remove(graph[nx][ny]);
			}
		}
	}
}
