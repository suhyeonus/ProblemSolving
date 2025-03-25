import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer nk = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(nk.nextToken());
        int k = Integer.parseInt(nk.nextToken());

        int[] dp = new int[k+1];
        Arrays.fill(dp, 100001);
        dp[0] = 0;

        int[] c = new int[n];
        StringTokenizer coffee = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < n; i++) 
            c[i] = Integer.parseInt(coffee.nextToken());

        for(int i = 0; i < n; i++) 
            for(int j = k; j > 0; j--) 
                if (j >= c[i])
                    dp[j] = Math.min(dp[j-c[i]] + 1, dp[j]);

        System.out.print(dp[k] == 100001 ? -1 : dp[k]);
    }
}
