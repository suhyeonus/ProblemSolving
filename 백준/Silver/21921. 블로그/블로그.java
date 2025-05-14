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
		HashMap<Integer, Integer> hs = new HashMap<Integer, Integer>();
		for(int i = X; i <= N; i++) {
			int subset = sum[i] - sum[i-X];
			if(!hs.containsKey(subset))
				hs.put(subset, 1);
			else 
				hs.replace(subset, hs.get(subset) + 1);
			max = Math.max(max, subset);
		}
		
		if(max == 0)
			System.out.print("SAD");
		else {
			System.out.println(max);
			System.out.print(hs.get(max));
		}
	} 
}
