import java.io.*;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int arr[] = new int[N];
		int start = 0;
		int end = 0;
		int mid = 0;
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if(arr[i] > start) start = arr[i];
			end += arr[i];
		}
		
		while(start <= end) {
			int total_amount = 0;
			int now_count = 0;
			mid = (start + end) / 2;
			
			for(int i : arr) {
				if(now_count + i > mid) {
					total_amount++;
					now_count = 0;
				}
				now_count += i;
			}
			if(now_count != 0) total_amount++;
			
			if(total_amount > M)
				start = mid + 1;
			else end = mid - 1;
		}
		
		System.out.print(start);
	}
	
	
}
