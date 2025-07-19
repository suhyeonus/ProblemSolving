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
        int K = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        graph = new ArrayList[N+1];
        visit = new int[N+1];

        for(int i = 1; i <= N; i++)
            graph[i] = new ArrayList<>();
        Arrays.fill(visit, -1);

        int a, b;
        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
        }

        visit[X] = 0;
        BFS(X);

        boolean exist = false;
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= N; i++)
            if(visit[i] == K) {
                exist = true;
                sb.append(i + "\n");
            }

        System.out.print(exist ? sb : -1);
    }

    public static void BFS(int v) {
        visit[v] = 0;
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(v);

        int n;
        while(!q.isEmpty()) {
            n = q.poll();
            for(int x : graph[n])
                if(visit[x] == -1) {
                    visit[x] = visit[n] + 1;
                    q.add(x);
                }
        }
    }
}
