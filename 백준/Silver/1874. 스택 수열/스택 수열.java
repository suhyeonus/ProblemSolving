import java.io.*;
import java.util.Stack;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<Integer>();
		StringBuffer sb = new StringBuffer();
		
		int num = 1;
		boolean isvalid = true;
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++)
			arr[i] = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			int val = arr[i];
			if(val >= num) {
				while(val >= num) {
					stack.push(num++);
					sb.append("+\n");
				}
				stack.pop();
				sb.append("-\n");
			} else {
				int popped = stack.pop();
				if(popped > val) {
					System.out.print("NO");
					isvalid = false;
					break;
				}
				else sb.append("-\n");
				
			}
		}
		
		if(isvalid) System.out.print(sb.toString());
	} 
	
}
