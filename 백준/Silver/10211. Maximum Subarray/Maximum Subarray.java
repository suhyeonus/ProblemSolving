import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
				;
		int testCase = Integer.parseInt(br.readLine());
		while(testCase-- > 0) {
			int n = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int[] arr = new int[n];
			int[] dp = new int[n];
			
			for(int i = 0; i < n; i++)
				arr[i] = Integer.parseInt(st.nextToken());
			
			int answer = arr[0];
			dp[0] = arr[0];
			for(int i = 1; i < n; i++) {
				dp[i] = Math.max(dp[i-1] + arr[i], arr[i]);
				answer = Math.max(answer, dp[i]);
			}
			System.out.println(answer);
		}
	} 
}
