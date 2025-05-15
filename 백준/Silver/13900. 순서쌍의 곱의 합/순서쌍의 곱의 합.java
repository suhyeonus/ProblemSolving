import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		long sub[] = new long[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		long answer = 0;
		sub[0] = Integer.parseInt(st.nextToken());
		for(int i = 1; i < n; i++) {
			int val = Integer.parseInt(st.nextToken());
			sub[i] = sub[i-1] + val;
			answer += val * sub[i-1];
		}
			
		System.out.print(answer);
	} 
}
