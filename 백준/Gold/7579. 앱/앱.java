import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] dp = new int[10001];
        int memory = 0, cost = 0;
        int answer = Integer.MAX_VALUE;

        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < N; i++) {
            memory = Integer.parseInt(st1.nextToken());
            cost = Integer.parseInt(st2.nextToken());
            
            for(int j = 10000; j >= 0; j--) {
                if(i == 0 && j >= cost) dp[j] = memory;
                else if(j >= cost) dp[j] = Math.max(dp[j-cost] + memory, dp[j]); 
                
                if(dp[j] >= M) answer = Math.min(j, answer);
            }
        }                  

        System.out.print(answer);
    }
}
