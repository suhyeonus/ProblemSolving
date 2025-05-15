import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		long arr[] = new long[n];
		long sub[] = new long[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < n; i++)
			arr[i] = Integer.parseInt(st.nextToken());
		
		long answer = 0;
		sub[0] = arr[0];
		for(int i = 1; i < n; i++) {
			sub[i] = sub[i-1] + arr[i];
			answer += arr[i] * sub[i-1];
		}
			
		System.out.print(answer);
	} 
}
