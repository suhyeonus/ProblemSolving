import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
	
	private static int[] arr;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		arr = new int[n];
		for(int i = 0; i < n; i++)
			arr[i] = Integer.parseInt(br.readLine());
		
		Arrays.sort(arr);
		
		for(int i = 0; i < m; i++) {
			int idx = Integer.parseInt(br.readLine());
			System.out.println(binarySearch(idx));
		}
	}
	
	private static int binarySearch(int n) {
		int start = 0;
		int end = arr.length - 1;
		int answer = -1;
		
		while(start <= end) {
			int mid = (start + end) / 2;
			if(arr[mid] == n) {
				answer = mid;
				end = mid - 1;
			}
			else if(arr[mid] < n) start = mid + 1;
			else end = mid - 1;
		}
		
		return answer;
	}
}
