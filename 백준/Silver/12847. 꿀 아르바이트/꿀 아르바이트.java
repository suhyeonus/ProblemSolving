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
		
		st = new StringTokenizer(br.readLine(), " ");
		long arr[] = new long[n];
		for(int i = 0; i < n; i++)
			arr[i] = Integer.parseInt(st.nextToken());
		
		for(int i = 1; i < m; i++) arr[i] += arr[i-1];
		long answer = arr[m-1];
		
		for(int i = m; i < n; i++) {
			arr[i] += arr[i-1];
			answer = Math.max(answer, arr[i] - arr[i-m]);
		}
		
		System.out.print(answer);
	} 
	
}
