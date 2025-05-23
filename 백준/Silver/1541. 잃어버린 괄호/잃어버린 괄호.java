import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		String[] arr = s.split("-");
		int answer = 0;
		
		for(int n = 0; n < arr.length; n++) {
			int total = 0;
			int now_count = 0;
			
			for(int i = 0; i < arr[n].length(); i++) {
				if(arr[n].charAt(i) == '+') {
					total += now_count;
					now_count = 0;
				} else now_count = now_count * 10 + (int)(arr[n].charAt(i) - '0');
			}
			total += now_count;
			
			if(n == 0) answer += total;
			else answer -= total;
		}
		
		System.out.print(answer);
	}
}
