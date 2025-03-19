import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer nt = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(nt.nextToken());
        int t = Integer.parseInt(nt.nextToken());

        int[][] dp = new int[n+1][t+1];
        int[] k = new int[n+1];
        int[] s = new int[n+1];

        for(int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            k[i] = Integer.parseInt(st.nextToken());
            s[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 1; i <= n; i++) 
            for(int j = 1; j <= t; j++) 
                if(j >= k[i])
                    dp[i][j] = Math.max(dp[i-1][j-k[i]] + s[i] , dp[i-1][j]);
                else dp[i][j] = dp[i-1][j];

        System.out.print(dp[n][t]);
    }
}
