import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
	
	private static int[] arr;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++)
			arr[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(arr);
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < M; i++) {
			int index = Integer.parseInt(st.nextToken());
			System.out.println(binarySearch(index));
		}
	}
	
	private static int binarySearch(int n) {
		int start_idx = 0;
		int end_idx = arr.length - 1;
		
		while(start_idx <= end_idx) {
			int mid_idx = (start_idx + end_idx) / 2;
			
			if(arr[mid_idx] == n) return 1;
			else if(arr[mid_idx] < n) start_idx = mid_idx + 1;
			else end_idx = mid_idx - 1;
		}
		return 0;
	}
}
