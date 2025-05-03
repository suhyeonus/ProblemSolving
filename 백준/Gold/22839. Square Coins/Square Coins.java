import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if(n == 0) break;

            int[] dp = new int[n+1];
            for(int i = 1; i <= 17; i++) {
                for(int j = 1; j <= n; j++) {
                    int double_i = i*i;
                    if(j == double_i)
                        dp[j] += 1;
                    else if (j >= double_i)
                        dp[j] += dp[j-double_i];
                }
            }
            System.out.println(dp[n]);
        }
    }
}
