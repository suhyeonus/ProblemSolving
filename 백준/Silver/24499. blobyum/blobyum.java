import java.io.*;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		int arr[] = new int[n+k-1];
		for(int i = 0; i < n; i++)
			arr[i] = Integer.parseInt(st.nextToken());
		
		for(int i = n; i < arr.length; i++)
			arr[i] = arr[i-n];

		long sum = 0, answer = 0;
		for(int i = 0; i < k; i++)
			sum += arr[i];
		answer = Math.max(answer, sum);
		
		for(int i = k; i < arr.length; i++) {
			sum += arr[i] - arr[i-k];
			answer = Math.max(answer, sum);
		}
		
		System.out.print(answer);
	} 
}
