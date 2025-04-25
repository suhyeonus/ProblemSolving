import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] dp = new int[m+1];

        for(int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            int W =  Integer.parseInt(st.nextToken());
            int D = Integer.parseInt(st.nextToken());

            for(int j = m; j >= 1; j--) 
                if (j >= W) dp[j] = Math.max(dp[j-W] + D, dp[j]);
        }
        System.out.print(dp[m]);
    }
}
