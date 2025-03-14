import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
		
			int N = sc.nextInt();	// 물품 개수
            int K = sc.nextInt();	// 배낭 무게
           
            int[][] dp = new int[N+1][K+1];
            int[] V = new int[N+1];		// 무게
            int[] C = new int[N+1];		// 가치
            
            for(int i = 1; i <= N; i++) {
            	V[i] = sc.nextInt();
                C[i] = sc.nextInt();
            }
            
            for(int i = 1; i <= N; i++) 
            	for(int j = 1; j <= K; j++) 
                    if(V[i] <= j) 
                        dp[i][j] = Math.max(dp[i-1][j-V[i]] + C[i], dp[i-1][j]);
                    else dp[i][j] = dp[i-1][j];
                
            System.out.printf("#%d %d%n", test_case, dp[N][K]);
		}
	}
}