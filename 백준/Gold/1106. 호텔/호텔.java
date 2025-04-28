import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int c = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[] dp = new int[c+101];
        Arrays.fill(dp, 2147000000);
        dp[0] = 0;
        
        for(int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int price = Integer.parseInt(st.nextToken());
            int bnfit = Integer.parseInt(st.nextToken());

            for(int j = bnfit; j <= c + 100; j++) 
                dp[j] = Math.min(dp[j-bnfit] + price ,dp[j]);       
        }

        int answer = 2147000000;
        for(int j = c; j <= c + 100; j++)
            answer = Math.min(answer, dp[j]);
        System.out.print(answer);
    }
}
