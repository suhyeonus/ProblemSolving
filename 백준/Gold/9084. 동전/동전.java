import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while(T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            int[] coin = new int[N+1];

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int i = 1; i <= N; i++)
                coin[i] = Integer.parseInt(st.nextToken()); 
            
            int target = Integer.parseInt(br.readLine());
            int[] dp = new int[target+1];

            for(int i = 1; i <= N; i++) 
                for(int j = 1; j <= target; j++) 
                    if (j == coin[i])
                        dp[j] += 1;
                    else if (j > coin[i])
                        dp[j] = dp[j] + dp[j-coin[i]];

            System.out.println(dp[target]);
            
        }
    }
}
