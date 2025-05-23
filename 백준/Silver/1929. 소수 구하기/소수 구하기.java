import java.io.*;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N+1];
		arr[1] = 1;
		
		for(int i = 2; i <= Math.sqrt(N); i++) {
			if(arr[i] == 1) continue;
			for(int j = i+i; j <= N; j += i)
				arr[j] = 1;
		}
		
		for(int i = M; i <= N; i++)
			if(arr[i] == 0) System.out.println(i);
	}
	
	
}
