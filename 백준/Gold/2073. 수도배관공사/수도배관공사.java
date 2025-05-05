import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int D = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int[][] dp = new int[P+1][D+1];

        for(int i = 1; i <= P; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int L = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());

            for(int j = 1; j <= D; j++) 
                if (j == L) 
                    dp[i][j] = Math.max(C, dp[i-1][j]);
                else if (j >= L) 
                    dp[i][j] = Math.max(Math.min(dp[i-1][j-L], C), dp[i-1][j]);
                else dp[i][j] = dp[i-1][j];
        }
        
        System.out.print(dp[P][D]);
    }
}
