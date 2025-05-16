import java.io.*;
import java.util.StringTokenizer;
import java.util.Stack;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		Stack<int[]> s = new Stack<int[]>();
		
		for(int i = 0; i < n; i++) {
			int height = Integer.parseInt(st.nextToken());;
			while(!s.isEmpty()) {
				if(s.peek()[0] >= height) {
					System.out.print(s.peek()[1] + " ");
					break;
				}
				s.pop();
			}
			if(s.isEmpty()) System.out.print("0 ");
			s.push(new int[] {height, i+1});
		}
	} 
}
