import java.io.*;
import java.util.*;

public class Main {
    static int M, N, K;
    static int[][] graph, visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int answer;
        int testCase = Integer.parseInt(br.readLine());
        while(testCase-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            graph = new int[M][N];
            visit = new int[M][N];
            while(K-- > 0) {
                st = new StringTokenizer(br.readLine(), " ");
                graph[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = 1;
            }

            answer = 0;
            for(int i = 0; i < M; i++)
                for(int j = 0; j < N; j++)
                    if(graph[i][j] == 1 && visit[i][j] == 0) {
                        BFS(i, j);
                        answer++;
                    }

            System.out.println(answer);
        }

    }

    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0 ,0};

    public static void BFS(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {x, y});
        visit[x][y] = 1;

        int[] popped;
        int nx, ny;
        while(!q.isEmpty()) {
            popped = q.poll();
            for(int i = 0; i < 4; i++) {
                nx = popped[0] + dx[i];
                ny = popped[1] + dy[i];

                if(0 <= nx && nx < M && 0 <= ny && ny < N
                        && graph[nx][ny] == 1 && visit[nx][ny] == 0) {
                    q.add(new int[] {nx, ny});
                    visit[nx][ny] = 1;
                }
            }
        }
    }

}
