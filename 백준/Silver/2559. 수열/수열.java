import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		int arr[] = new int[N+1];
		for(int i = 1; i <= N; i++)
			arr[i] = Integer.parseInt(st.nextToken());
		
		for(int i = 1; i <= K; i++)
			arr[i] += arr[i-1];
		
		int answer = arr[K];
		for(int i = K+1; i <= N; i++) {
			arr[i] += arr[i-1];
			answer = Math.max(answer, arr[i] - arr[i-K]);
		}
		
		System.out.print(answer);
	} 
}
