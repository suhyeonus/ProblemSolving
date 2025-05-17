import java.io.*;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class Main {
	
	static int N;
	static ArrayList<Integer> friends[];
	static boolean visited[];
	static boolean isvalid = false;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		friends = new ArrayList[N];
		visited = new boolean[N];
		
		for(int i = 0; i < N; i++)
			friends[i] = new ArrayList<Integer>();
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			friends[u].add(v);
			friends[v].add(u);
		}
		
		for(int i = 0; i < N; i++) {
			if(!visited[i])
				DFS(i, 1);
			if(isvalid) break;
		}
		
		System.out.print(isvalid ? 1 : 0);
	} 
	
	private static void DFS(int x, int len) {
		if(isvalid) return;
		if(visited[x]) return;
		if(len >= 5) {
			isvalid = true;
			return;
		}
		
		visited[x] = true;
		for(int i : friends[x]) {
			if(!visited[i])
				DFS(i, len+1);
		}
		visited[x] = false;
	}
}
