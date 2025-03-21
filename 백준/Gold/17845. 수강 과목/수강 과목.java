import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer nk = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(nk.nextToken());
        int k = Integer.parseInt(nk.nextToken());

        int[][] dp = new int[k+1][n+1];
        int[] point = new int[k+1];
        int[] stime = new int[k+1];

        for(int i = 1; i <= k; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            point[i] = Integer.parseInt(st.nextToken());
            stime[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 1; i <= k; i++) {
            for(int j = 1; j <= n; j++) {
                if(j >= stime[i])
                    dp[i][j] = Math.max(dp[i-1][j-stime[i]] + point[i],dp[i-1][j]);
                else dp[i][j] = dp[i-1][j];
            }
        }

        System.out.print(dp[k][n]);

    }
}
