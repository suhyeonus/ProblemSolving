import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		
		int answer = 0;
		int rt[] = new int[N+L];
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = L; i < N+L; i++) {
			rt[i] = rt[i-1] + Integer.parseInt(st.nextToken());
			if(129 <= rt[i] - rt[i-L] && rt[i] - rt[i-L] <= 138)
				answer++;
		}
		
		System.out.print(answer);
	} 
}
