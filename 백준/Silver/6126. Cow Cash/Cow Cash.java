import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        long[] dp = new long[m+1];
        dp[0] = 1;


        for(int i = 1; i <= n; i++) {
            int v = Integer.parseInt(br.readLine());
            for(int j = 1; j <= m; j++) 
                if(j >= v)
                    dp[j] = dp[j] + dp[j-v];
        }
        System.out.print(dp[m]);
    }
}
