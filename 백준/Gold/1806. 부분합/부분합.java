import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		long arr[] = new long[n+1];
		for(int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			arr[i] += arr[i-1];
		}
		
		int len = Integer.MAX_VALUE;
		int start = 1, end = 1;
		while(end <= n && start <= end) {
			if (arr[end] - arr[start-1] >= s) {
				len = Math.min(len, end-start+1);
				start++;
			} else {
				end++;
			}
		}
		
		System.out.print(len != Integer.MAX_VALUE ? len : 0);
	} 
	
}
