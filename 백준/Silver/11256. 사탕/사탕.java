import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Collections;

class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int J, N, index, answer;
		Integer[] box;
		
		int T = Integer.parseInt(br.readLine());
		while(T-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			J = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			box = new Integer[N];
			
			for(int n = 0; n < N; n++) {
				st = new StringTokenizer(br.readLine(), " ");
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				box[n] = a*b;
			}
			
			Arrays.sort(box, Collections.reverseOrder());
			
			index = 0; answer = 0;
			while(J > 0) {
				J -= box[index];
				answer++;
				index++;
			}
			
			System.out.println(answer);
		}
	}
}
