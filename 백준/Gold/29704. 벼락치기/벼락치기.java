import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer nt = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(nt.nextToken());
        int t = Integer.parseInt(nt.nextToken());

        int totalFine = 0;
        int[] days = new int[n+1];
        int[] fine = new int[n+1];
        int[][] dp = new int[n+1][t+1];

        for(int i = 1; i <= n; i++) {
            StringTokenizer dm = new StringTokenizer(br.readLine(), " ");
            days[i] = Integer.parseInt(dm.nextToken());
            fine[i] = Integer.parseInt(dm.nextToken());
            totalFine += fine[i];
        }

        for(int i = 1; i <= n; i++)
            for(int j = 1; j <= t; j++)
                if (j >= days[i])
                    dp[i][j] = Math.max(dp[i-1][j-days[i]] + fine[i], dp[i-1][j]);
                else dp[i][j] = dp[i-1][j];

        System.out.print(totalFine - dp[n][t] > 0 ? totalFine - dp[n][t] : 0);
    }
}
