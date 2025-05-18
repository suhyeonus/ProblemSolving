import java.io.*;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;
import java.util.LinkedList;

class Node {
	int number;
	int weight;
	
	public Node(int number, int weight) {
		this.number = number;
		this.weight = weight;
	}
}

public class Main {
	static ArrayList<Node>[] graph;
	static boolean[] visit;
	static int[] distance;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int V = Integer.parseInt(br.readLine());
		
		// init & input
		graph = new ArrayList[V+1];
		for(int i = 1; i <= V; i++) 
			graph[i] = new ArrayList<Node>();
			
		for(int i = 0; i < V; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int index = Integer.parseInt(st.nextToken());
			while(true) {
				int number = Integer.parseInt(st.nextToken());
				if(number == -1) break;
				int weight = Integer.parseInt(st.nextToken());
				graph[index].add(new Node(number, weight));
			}
		}
		
		visit = new boolean[V+1];
		distance = new int[V+1];
		int max = 1;
		BFS(1);
		
		for(int i = 1; i <= V; i++)
			if(distance[max] < distance[i])
				max = i;
		
		visit = new boolean[V+1];
		distance = new int[V+1];
		BFS(max);
		
		Arrays.sort(distance);
		System.out.print(distance[V]);
	} 
	
	
	
	private static void BFS(int v) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(v);
		visit[v] = true;
		
		while(!q.isEmpty()) {
			int now_node = q.poll();
			for(Node n : graph[now_node]) {
				int number = n.number;
				int weight = n.weight;
				
				if(!visit[number]) {
					visit[number] = true;
					distance[number] = distance[now_node] + weight;
					q.add(number);
				}
			}
		}
	}
}
