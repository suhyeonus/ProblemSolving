import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int answer = Integer.MAX_VALUE;
        int[] dp = new int[10001];
        int[] memory = new int[N];
        int[] cost = new int[N];

        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < N; i++) {
            memory[i] = Integer.parseInt(st1.nextToken());
            cost[i] = Integer.parseInt(st2.nextToken());
            
            for(int j = 10000; j >= 0; j--) {
                if(i == 0 && j >= cost[i]) dp[j] = memory[i];
                else if(j >= cost[i]) dp[j] = Math.max(dp[j-cost[i]] + memory[i], dp[j]); 
                
                if(dp[j] >= M) answer = Math.min(j, answer);
            }
        }                  

        System.out.print(answer);
    }
}
