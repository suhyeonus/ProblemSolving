import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int mushrooms[] = new int[11];
		int answer = 0;
		
		for(int i = 1; i <= 10; i++) {
			mushrooms[i] = mushrooms[i-1] + Integer.parseInt(br.readLine());
			if(Math.abs(answer-100) > Math.abs(mushrooms[i] - 100))
				answer = mushrooms[i];
			else if(Math.abs(answer-100) == Math.abs(mushrooms[i] - 100))
				answer = Math.max(answer, mushrooms[i]);
		}
		
		System.out.print(answer);
	} 
}
