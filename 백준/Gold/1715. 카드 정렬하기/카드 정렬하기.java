import java.io.*;
import java.util.PriorityQueue;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		for(int i = 0; i < N; i++)
			pq.add(Integer.parseInt(br.readLine()));
		
		int answer = 0;
		int a = 0, b = 0;
		while(pq.size() > 1) {
			a = pq.remove();
			b = pq.remove();
			answer += a + b;
			pq.add(a+b);
		}
		
		System.out.print(answer);
	}
}
