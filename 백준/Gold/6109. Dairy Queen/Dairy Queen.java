import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int[] dp = new int[n+1];

        for(int i = 0; i < c; i++) {
            int coin = Integer.parseInt(br.readLine());
            for(int j = 1; j <= n; j++) 
                if (j == coin) dp[j] += 1;
                else if (j > coin) dp[j] += dp[j-coin];
        }

        System.out.print(dp[n]);
    }
}
