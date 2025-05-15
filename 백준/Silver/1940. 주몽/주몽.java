import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int arr[] = new int[N];
		for(int i = 0; i < N; i++)
			arr[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(arr);
		
		int answer = 0;
		int start_idx = 0, end_idx = N-1;
		while(start_idx < end_idx) {
			if(arr[start_idx] + arr[end_idx] == M) {
				answer++;
				start_idx++;
				end_idx--;
			} else if(arr[start_idx] + arr[end_idx] < M)
				start_idx++;
			else end_idx--;
		}
		
		System.out.print(answer);
	} 
}
