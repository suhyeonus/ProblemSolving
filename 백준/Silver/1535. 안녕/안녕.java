import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] L = new int[N+1];
        int[] J = new int[N+1];
        int[][] dp = new int[N+1][100];

        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");

        for(int i = 1; i <= N; i++) {
            L[i] = Integer.parseInt(st1.nextToken());
            J[i] = Integer.parseInt(st2.nextToken());
        }

        for(int i = 1; i <= N; i++) 
            for(int j = 1; j < 100; j++) 
                if(j >= L[i])
                    dp[i][j] = Math.max(dp[i-1][j-L[i]] + J[i], dp[i-1][j]);
                else dp[i][j] = dp[i-1][j];

        System.out.print(dp[N][99]);
    }
}
