import java.io.*;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		long arr[] = new long[n+1];
		for(int i = 0; i < n; i++) 
			arr[i] = Integer.parseInt(st.nextToken());
		
		int len = Integer.MAX_VALUE;
		int start = 0, end = 0;
		int sum = 0;
		while(end <= n && start <= end) {
			if (sum < s) {
				sum += arr[end++];
			} else if (sum >= s) {
				len = Math.min(len, end-start);
				sum -= arr[start++];
			}
		}
		
		System.out.print(len != Integer.MAX_VALUE ? len : 0);
	} 
	
}
