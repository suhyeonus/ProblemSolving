import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int count = 1;
		int nowSum = 1;
		int start_idx = 1, end_idx = 1;
		
		while(end_idx != N) 
			if(nowSum == N) {
				count++;
				end_idx++;
				nowSum += end_idx;
			}
			else if (nowSum < N) {
				end_idx++;
				nowSum += end_idx;
			}
			else {
				nowSum -= start_idx;
				start_idx++;
			}
		
		System.out.print(count);
	} 
}
