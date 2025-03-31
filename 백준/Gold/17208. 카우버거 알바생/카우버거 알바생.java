import java.io.*;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer nmk = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(nmk.nextToken());
        int m = Integer.parseInt(nmk.nextToken());
        int k = Integer.parseInt(nmk.nextToken());

        int[] x = new int[n+1];
        int[] y = new int[n+1];
        int[][] dp = new int[m+1][k+1];

        for(int i = 1; i <= n; i++) {
            StringTokenizer xy = new StringTokenizer(br.readLine(), " ");
            x[i] = Integer.parseInt(xy.nextToken());
            y[i] = Integer.parseInt(xy.nextToken());
        }

        for(int i = 1; i <= n; i++)
            for(int j = m; j >= 1; j--)
                for(int l = k; l >= 1; l--)
                    if (j >= x[i] && l >= y[i])
                        dp[j][l] = Math.max(dp[j-x[i]][l-y[i]] + 1 ,dp[j][l]);
                    else dp[j][l] = dp[j][l];

        System.out.print(dp[m][k]);
    }
}
