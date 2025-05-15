import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int tc = Integer.parseInt(br.readLine());
		while(tc-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			int A[] = new int[N];
			int B[] = new int[M];
			
			st = new StringTokenizer(br.readLine(), " ");
			for(int i = 0; i < N; i++)
				A[i] = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine(), " ");
			for(int i = 0; i < M; i++)
				B[i] = Integer.parseInt(st.nextToken());
			
			Arrays.sort(A);
			Arrays.sort(B);
			
			int answer = 0;
			int a_idx = 0, b_idx = 0;
			while(true) {
				if(a_idx == N || b_idx == M) break;
				if(A[a_idx] > B[b_idx]) {
					answer += N - a_idx;
					b_idx++;	
				} else 
					a_idx++;
			}
			
			System.out.println(answer);
		}
	} 
}
