import java.io.*;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class Main {
	
	static ArrayList<Integer>[] graph;
	static boolean visit[];
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		graph = new ArrayList[N+1];
		visit = new boolean[N+1];
		
		for(int i = 1; i <= N; i++)
			graph[i] = new ArrayList<Integer>();
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			graph[u].add(v);
			graph[v].add(u);
		}
		
		int answer = 0;
		for(int i = 1; i <= N; i++) 
			if(!visit[i]) {
				DFS(i);
				answer++;
			}
		
		System.out.print(answer);
	} 
	
	private static void DFS(int x) {
		if(visit[x]) return;
		visit[x] = true;
		
		for(int i : graph[x]) 
			if(!visit[i]) 
				DFS(i);
	}

}
