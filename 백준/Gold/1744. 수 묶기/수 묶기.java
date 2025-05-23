import java.io.*;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		// positive
		PriorityQueue<Integer> q_pos = new PriorityQueue<Integer>(Collections.reverseOrder());
		PriorityQueue<Integer> q_neg = new PriorityQueue<Integer>();
		int count_0 = 0, count_1 = 0;
		
		for(int i = 0; i < N; i++) {
			int value = Integer.parseInt(br.readLine());
			if(value == 0) count_0++;
			else if(value == 1) count_1++;
			else if(value > 1) q_pos.add(value);
			else q_neg.add(value);
		}
		
		int answer = count_1;
		int a, b;
		
		while(q_pos.size() >= 2) {
			a = q_pos.remove();
			b = q_pos.remove();
			answer += a*b;
		} 
		if(q_pos.size() != 0) answer += q_pos.remove();
		
		while(q_neg.size() >= 2) {
			a = q_neg.remove();
			b = q_neg.remove();
			answer += a*b;
		}
		if(q_neg.size() != 0) {
			if(count_0 > 0) {
				count_0--;
				q_neg.remove();
				} else answer += q_neg.remove();
		}
		
		System.out.print(answer);
	}
}
