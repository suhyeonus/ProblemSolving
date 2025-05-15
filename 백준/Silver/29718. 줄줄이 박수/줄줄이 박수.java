import java.io.*;
import java.util.StringTokenizer;

public class Main {

	static int pwd_template[] = new int[4];
	static int pwd_now[] = new int[4];
	static int answer = 0, count = 0;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		long arr[][] = new long[n+1][m+1];
		for(int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 1; j <= m; j++) 
				arr[i][j] += arr[i-1][j] + arr[i][j-1] - arr[i-1][j-1] + Integer.parseInt(st.nextToken());
		}
		
		int a = Integer.parseInt(br.readLine());
		long answer = arr[n][a];
		for(int j = a+1; j <= m; j++) 
			answer = Math.max(answer, arr[n][j] - arr[n][j-a]);
		
		System.out.print(answer);
	} 
	
}
