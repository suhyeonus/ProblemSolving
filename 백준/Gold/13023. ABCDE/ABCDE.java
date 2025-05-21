import java.io.*;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class Main {
	
	private static ArrayList<Integer>[] graph;
	private static boolean[] visit;
	private static boolean isValid = false;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		graph = new ArrayList[n];
		for(int i = 0; i < n; i++)
			graph[i] = new ArrayList<Integer>();
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			graph[a].add(b);
			graph[b].add(a);
		}
		
		visit = new boolean[n];
		for(int i = 0; i < n; i++) {
			if(!visit[i])
				DFS(i, 1);
			if(isValid) break;
		}
		
		System.out.print(isValid ? 1 : 0);
	}
	
	private static void DFS(int x, int depth) {
		if(depth == 5) {
			isValid = true;
			return;
		}
		if(visit[x]) return;
		if(isValid) return; 
		
		visit[x] = true;
		for(int i : graph[x]) 
			if(!visit[i])
				DFS(i, depth+1);
		visit[x] = false;
	}
}
