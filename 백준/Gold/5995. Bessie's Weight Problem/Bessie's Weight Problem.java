import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int h = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int[] dp = new int[h+1];

        for(int i = 0; i < n; i++) {
            int weight = Integer.parseInt(br.readLine());
            for(int j = h; j >= weight; j--) 
                    dp[j] = Math.max(dp[j-weight] + weight, dp[j]);
        }

        System.out.print(dp[h]);
    }
}
