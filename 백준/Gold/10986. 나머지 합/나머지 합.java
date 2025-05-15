import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		long answer = 0;
		
		long subsetSum[] = new long[N];
		long remainder[] = new long[M];
		
		st = new StringTokenizer(br.readLine(), " ");
		subsetSum[0] = Integer.parseInt(st.nextToken());
		for(int i = 1; i < N; i++)
			subsetSum[i] = subsetSum[i-1] + Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < N; i++) {
			int divided = (int) (subsetSum[i] % M);
			if(divided == 0) answer++;
			remainder[divided]++;
		}
		
		for(int i = 0; i < M; i++) 
			if(remainder[i] > 1) 
				answer += remainder[i] * (remainder[i]-1) / 2;
		
		System.out.print(answer);
	} 
}
