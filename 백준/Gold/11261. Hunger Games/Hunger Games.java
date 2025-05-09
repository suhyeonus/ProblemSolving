import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        while(testCase-- > 0) {
            int N = Integer.parseInt(br.readLine());
            int W = Integer.parseInt(br.readLine());
            int[] dp = new int[W+1];
            
            StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");

            for(int i = 1; i <= N; i++) {
                int weight = Integer.parseInt(st1.nextToken());
                int value = Integer.parseInt(st2.nextToken());

                for(int j = W; j >= 1; j--) 
                    if(j >= weight) dp[j] = Math.max(dp[j-weight] + value, dp[j]);
            }
            System.out.println(dp[W]);
        }
    }
}
