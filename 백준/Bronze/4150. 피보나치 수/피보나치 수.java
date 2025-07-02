import java.io.*;
import java.math.BigInteger;

class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		BigInteger[] dp = new BigInteger[n+1];
		
		if(n == 0 || n == 1) System.out.print(n);
		else {
			dp[1] = BigInteger.valueOf(1); 
			dp[2] = BigInteger.valueOf(1);
			
			for(int i = 3; i <= n; i++)
				dp[i] = dp[i-2].add(dp[i-1]);
			System.out.print(dp[n]);
		}
		
	}
}
