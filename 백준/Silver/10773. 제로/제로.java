import java.io.*;
import java.util.Stack;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		Stack<Integer> s = new Stack<Integer>();
		int answer = 0;
		
		while(n-- > 0) {
			int input = Integer.parseInt(br.readLine());
			if(input == 0) {
				int popped = s.pop();
				answer -= popped;
			} else {
				answer += input;
				s.push(input);
			}
		}
		
		System.out.print(answer);
	} 
}
