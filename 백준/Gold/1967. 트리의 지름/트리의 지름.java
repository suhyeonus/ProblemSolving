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
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		graph = new ArrayList[n+1];
		for(int i = 1; i <= n; i++)
			graph[i] = new ArrayList<Node>();
		
		for(int i = 0; i < n-1; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int parent = Integer.parseInt(st.nextToken());
			int child = Integer.parseInt(st.nextToken());
			int weight = Integer.parseInt(st.nextToken());
			graph[parent].add(new Node(child, weight));
			graph[child].add(new Node(parent, weight));
		}
		
		visit = new boolean[n+1];
		distance = new int[n+1];
		int max = 1;
		BFS(1);
		
		for(int i = 1; i <= n; i++) 
			if(distance[max] < distance[i])
				max = i;
		
		visit = new boolean[n+1];
		distance = new int[n+1];
		BFS(max);
		
		Arrays.sort(distance);
		System.out.print(distance[n]);
	} 
	
	
	
	private static void BFS(int x) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(x);
		visit[x] = true;
		
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
