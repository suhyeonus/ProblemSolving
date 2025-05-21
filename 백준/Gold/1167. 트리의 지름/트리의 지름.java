import java.io.*;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;
import java.util.LinkedList;

class Node {
	int number;
	int weight;
	
	public Node (int number, int weight) {
		this.number = number;
		this.weight = weight;
	}
}

public class Main {
	
	private static ArrayList<Node>[] graph;
	private static boolean[] visit;
	private static int[] distance;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		// init
		int v = Integer.parseInt(br.readLine());
		graph = new ArrayList[v+1];
		for(int i = 1; i <= v; i++)
			graph[i] = new ArrayList<Node>();
		
		for(int i = 0; i < v; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int index_num = Integer.parseInt(st.nextToken());
			while(true) {
				int number = Integer.parseInt(st.nextToken());
				if(number == -1) break;
				int weight = Integer.parseInt(st.nextToken());
				graph[index_num].add(new Node(number, weight));
			}
		}
		
		// farthest node
		visit = new boolean[v+1];
		distance = new int[v+1];
		int max_index = 1;
		BFS(1);
		
		for(int i = 1; i <= v; i++)
			if(distance[i] > distance[max_index])
				max_index = i;
		
		visit = new boolean[v+1];
		distance = new int[v+1];
		BFS(max_index);
		
		Arrays.sort(distance);
		System.out.print(distance[v]);
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
					q.add(number);
					visit[number] = true;
					distance[number] = distance[now_node] + weight;
				}
			}
		}
	}
}
