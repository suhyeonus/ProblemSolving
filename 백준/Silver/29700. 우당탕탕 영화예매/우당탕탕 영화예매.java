import java.io.*;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int answer = 0;
		for(int i = 0; i < n; i++) {
			char arr[] = br.readLine().toCharArray();
			
			if(m >= k) {
				int count = 0;
				for(int j = 0; j < k; j++) 
					if(arr[j] == '1') count++;
				
				if(count == 0) answer++;
				
				for(int j = k; j < arr.length; j++) {
					if(arr[j] == '1') count++;
					if(arr[j-k] == '1') count--;
					if(count == 0) answer++;
				}
			}
		}
		
		System.out.println(answer);
	} 
	
}
