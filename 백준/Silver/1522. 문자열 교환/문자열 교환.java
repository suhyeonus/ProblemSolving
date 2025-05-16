import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String ab = br.readLine();
		int a_count = 0;
		for(int i = 0; i < ab.length(); i++)
			if(ab.charAt(i) == 'a') a_count++;
		
		int now_count = 0;
		for(int i = 0; i < a_count; i++) {
			if(ab.charAt(i) == 'b') now_count++;
			ab += ab.charAt(i);
		}
		
		int answer = now_count;
		for(int i = a_count; i < ab.length(); i++) {
			if(ab.charAt(i) == 'b') now_count++;
			if(ab.charAt(i-a_count) == 'b') now_count--;
			answer = Math.min(answer, now_count);
		}
		
		System.out.print(answer);
	} 
	
}
