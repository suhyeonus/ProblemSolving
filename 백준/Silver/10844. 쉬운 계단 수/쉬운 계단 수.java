import java.util.Scanner;
import java.util.Arrays;

public class Main {

	static long[][] dp;
	static long mod = 1000000000;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		dp = new long[N+1][10];
		
		for(int i = 1; i <= 9; i++)
			dp[1][i] = 1;
		
		for(int i = 2; i <= N; i++) {
			for(int j = 0; j <= 9; j++) {
				if(j == 0)
					dp[i][j] = dp[i-1][j+1] % mod;
				else if(j == 9)
					dp[i][j] = dp[i-1][j-1] % mod;
				else dp[i][j] = (dp[i-1][j-1] + dp[i-1][j+1]) % mod;
			}
		}
		
		System.out.print(Arrays.stream(dp[N]).sum()%mod);
		sc.close();
	}
}
