import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int Q = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		int A[] = new int[N];
		for(int i = 0; i < N; i++)
			A[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(A);
		
		int sortedA[] = new int[N+1];
		for(int i = 1; i <= N; i++)
			sortedA[i] = sortedA[i-1] + A[i-1];
		
		while(Q-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			int idx1 = Integer.parseInt(st.nextToken());
			int idx2 = Integer.parseInt(st.nextToken());
			System.out.println(sortedA[idx2] - sortedA[idx1-1]);
		}
	} 
}
