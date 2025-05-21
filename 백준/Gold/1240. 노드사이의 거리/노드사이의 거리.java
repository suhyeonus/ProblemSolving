import java.io.*;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
	
	private static ArrayList<int[]>[] graph;
	private static boolean[] visit;
	private static int[] distance;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		graph = new ArrayList[n+1];
		for(int i = 1; i <= n; i++)
			graph[i] = new ArrayList<int[]>();
		
		for(int i = 0; i < n-1; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			
			graph[a].add(new int[] {b, d});
			graph[b].add(new int[] {a, d});
		}
		
		for(int i = 0; i < m; i++) {
			visit = new boolean[n+1];
			distance = new int[n+1];
			
			st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			BFS(x, y);	
			System.out.println(distance[y]);
		}		
	}
	
	private static void BFS(int v, int dest) {

		Queue<Integer> q = new LinkedList<Integer>();
		q.add(v);
		visit[v] = true;
		
		while(!q.isEmpty()) {
			if(distance[dest] != 0) return;
			int now = q.poll();
			
			for(int[] i : graph[now]) {
				int node = i[0];
				int dist = i[1];
				if(!visit[node]) {
					q.add(node);
					distance[node] = distance[now] + dist;
					visit[node] = true;
				}
			}
		}
	
	}
	
}
