import java.io.*;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
	
	static ArrayList<Integer>[] graph;
	static boolean[] visit;
	static Queue<Integer> q = new LinkedList<Integer>();
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		
		graph = new ArrayList[N+1];
		for(int i = 1; i <= N; i++)
			graph[i] = new ArrayList<Integer>();
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			graph[u].add(v);
			graph[v].add(u);
		}
		
		for(int i = 1; i <= N; i++)
			Collections.sort(graph[i]);
		
		// DFS
		visit = new boolean[N+1];
		DFS(V);
		System.out.print("\n");
		
		// BFS
		visit = new boolean[N+1];
		BFS(V);
	} 
	
	private static void DFS(int x) {
		if(visit[x]) return;
		
		visit[x] = true;
		System.out.print(x + " ");
		
		for(int i : graph[x])
			if(!visit[i])
				DFS(i);
	}
	
	private static void BFS(int x) {
		visit[x] = true;
		q.add(x);
		
		while(!q.isEmpty()) {
			int now_node = q.poll();
			System.out.print(now_node + " ");
			
			for(int i : graph[now_node]) {
				if(!visit[i]) {
					visit[i] = true;
					q.add(i);
				}
			}
		}
	}
}
