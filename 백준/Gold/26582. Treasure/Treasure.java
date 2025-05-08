import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        while(testCase-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int I = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int[] dp = new int[W+1];

            for(int i = 0; i < I; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                int value = Integer.parseInt(st.nextToken());
                int weight = Integer.parseInt(st.nextToken());
                
                for(int j = W; j >= 1; j--)
                    if(j >= weight)
                        dp[j] = Math.max(dp[j-weight] + value, dp[j]);
            }
            System.out.println(dp[W]);
        }
    }
}
