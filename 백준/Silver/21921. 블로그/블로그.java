import java.io.*;
import java.util.StringTokenizer;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		int sum[] = new int[N+1];
		for(int i = 1; i <= N; i++) 
			sum[i] = sum[i-1] + Integer.parseInt(st.nextToken());

		int max = 0;
		int maxCnt = 1;
		for(int i = X; i <= N; i++) {
			int subset = sum[i] - sum[i-X];
			if (subset == max)
				maxCnt++;
			else if (subset > max) {
				max = subset;
				maxCnt = 1;
			}
		}
		
		if(max == 0)
			System.out.print("SAD");
		else {
			System.out.println(max);
			System.out.print(maxCnt);
		}
	} 
}
