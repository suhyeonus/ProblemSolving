import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());
        while (testCase-- > 0) {
            StringTokenizer nw = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(nw.nextToken());
            int w = Integer.parseInt(nw.nextToken());

            int[][] dp = new int[n+1][w+1];
            int[] weight = new int[n+1];
            int[] values = new int[n+1];

            for(int i = 1; i <= n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                weight[i] = Integer.parseInt(st.nextToken());
                values[i] = Integer.parseInt(st.nextToken());
            }

            for(int i = 1; i <= n; i++) {
                for(int j = 1; j <= w; j++) {
                    if (j >= weight[i])
                        dp[i][j] = Math.max(dp[i-1][j-weight[i]] + values[i] ,dp[i-1][j]);
                    else dp[i][j] = dp[i-1][j];
                }
            }

            System.out.println(dp[n][w]);
        }
    }
}
