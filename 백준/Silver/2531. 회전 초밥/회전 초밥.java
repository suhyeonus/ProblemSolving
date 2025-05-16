import java.io.*;
import java.util.StringTokenizer;
import java.util.HashMap;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		int dishes[] = new int[N+k-1];
		for(int i = 0; i < N; i++)
			dishes[i] = Integer.parseInt(br.readLine());
		for(int i = N; i < dishes.length; i++)
			dishes[i] = dishes[i-N];
		
		HashMap<Integer, Integer> sushi = new HashMap<Integer, Integer>();
		sushi.put(c, 1);
		
		// init
		for(int i = 0; i < k; i++) {
			if(sushi.containsKey(dishes[i]))
				sushi.put(dishes[i], sushi.get(dishes[i]) + 1);
			else sushi.put(dishes[i], 1);
		}
		int answer = sushi.size();
		
		for(int i = k; i < dishes.length; i++) {
			// remove
			sushi.put(dishes[i-k], sushi.get(dishes[i-k]) - 1);
			if(sushi.get(dishes[i-k]) == 0) sushi.remove(dishes[i-k]);
			
			// add
			if(sushi.containsKey(dishes[i]))
				sushi.put(dishes[i], sushi.get(dishes[i]) + 1);
			else sushi.put(dishes[i], 1);
			
			answer = Math.max(answer, sushi.size());
			int addas = 0;
		}
		
		System.out.print(answer);
	} 
	
}
