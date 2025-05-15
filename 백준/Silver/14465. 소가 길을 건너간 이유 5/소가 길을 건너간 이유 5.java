import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		int arr[] = new int[N+1];
		
		while(B-- > 0) 
			arr[Integer.parseInt(br.readLine())]++;
		
		for(int i = 1; i <= K; i++)
			arr[i] += arr[i-1];
		
		int answer = arr[K];
		for(int i = K+1; i <= N; i++) {
			arr[i] += arr[i-1];
			answer = Math.min(answer, arr[i] - arr[i-K]);
		}
		
		System.out.print(answer);
	} 
}
