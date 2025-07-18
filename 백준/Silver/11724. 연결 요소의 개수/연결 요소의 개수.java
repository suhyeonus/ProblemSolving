import java.io.*;
import java.util.*;

public class Main {

    static ArrayList<Integer>[] graph;
    static int[] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        graph = new ArrayList[N+1];
        visit = new int[N+1];

        for(int i = 1; i <= N; i++)
            graph[i] = new ArrayList<>();

        int u, v;
        for(int i = 0 ; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            u = Integer.parseInt(st.nextToken());
            v = Integer.parseInt(st.nextToken());
            graph[u].add(v);
            graph[v].add(u);
        }

        int count = 0;
        for(int i = 1; i <= N; i++)
            if(visit[i] == 0) {
                count++;
                BFS(i);
            }

        System.out.print(count);
    }

    public static void BFS(int i) {
        visit[i] = 1;
        Queue<Integer> q = new LinkedList<>();
        q.add(i);

        while(!q.isEmpty()) {
            int n = q.poll();
            for(int x : graph[n])
                if(visit[x] == 0) {
                    visit[x] = 1;
                    q.add(x);
                }
        }
        
    }
    
}


