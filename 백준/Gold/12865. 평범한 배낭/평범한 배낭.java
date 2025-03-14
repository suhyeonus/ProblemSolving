import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer nk = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(nk.nextToken());
        int k = Integer.parseInt(nk.nextToken());

        int[][] dp = new int[n+1][k+1];
        int[] weight = new int[n+1];
        int[] value = new int[n+1];

        for(int i = 0; i < n; i++) {
            StringTokenizer wv = new StringTokenizer(br.readLine(), " ");
            weight[i+1] = Integer.parseInt(wv.nextToken());
            value[i+1] =Integer.parseInt(wv.nextToken());
        }

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= k; j++) {
                if(weight[i] <= j) {
                    dp[i][j] = Math.max(dp[i-1][j-weight[i]] + value[i], dp[i-1][j]);
                } else dp[i][j] = dp[i-1][j];
            }
        }

        System.out.print(dp[n][k]);
    }
}
