import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        while (testCase-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] coins = new int[n+1];
            
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int i = 1; i <= n; i++) 
                coins[i] = Integer.parseInt(st.nextToken());

            int cost = Integer.parseInt(br.readLine());
            long[] dp = new long[cost+1];

            for(int i = 1; i <= n; i++) 
                for(int j = 1; j <= cost; j++) 
                    if (j == coins[i]) dp[j] = dp[j] + 1;
                    else if(j > coins[i])
                        dp[j] += dp[j-coins[i]];
            
            System.out.println(dp[cost]);
        }
    }
}
