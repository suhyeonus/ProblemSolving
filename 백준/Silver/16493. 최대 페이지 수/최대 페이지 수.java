import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer nm = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(nm.nextToken());
        int m = Integer.parseInt(nm.nextToken());

        int[][] dp = new int[m+1][n+1];
        int[] days = new int[m+1];
        int[] pages = new int[m+1];

        for(int i = 1; i <= m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            days[i] = Integer.parseInt(st.nextToken());
            pages[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 1; i <= m; i++) 
            for(int j = 1; j <= n; j++) 
                if(j >= days[i])
                    dp[i][j] = Math.max(dp[i-1][j-days[i]] + pages[i] ,dp[i-1][j]);
                else dp[i][j] = dp[i-1][j];

        System.out.print(dp[m][n]);
    }
}
