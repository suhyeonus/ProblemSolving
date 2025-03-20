import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer nk = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(nk.nextToken());
        int k = Integer.parseInt(nk.nextToken());

        int[] dp = new int[k+1];
        Arrays.fill(dp, Integer.MAX_VALUE - 1);
        dp[0] = 0;

        int[] coins = new int[n+1];
        for(int i = 1; i <= n; i++)
            coins[i] = Integer.parseInt(br.readLine());

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= k; j++) {
                if (j >= coins[i])
                    dp[j] = Math.min(dp[j-coins[i]] + 1, dp[j]);
            }
        }

        System.out.print(dp[k] == Integer.MAX_VALUE - 1 ? -1 : dp[k]);
    }
}
