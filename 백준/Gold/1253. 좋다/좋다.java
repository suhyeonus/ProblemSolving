import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		long arr[] = new long[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++)
			arr[i] = Long.parseLong(st.nextToken());
		
		Arrays.sort(arr);
		int answer = 0;
		
		for(int i = 0; i < N; i++) {
			long val = arr[i];
			int x = 0, y = N-1;
			
			while(x < y) {
				if(arr[x] + arr[y] == val) {
					if(x != i && y != i) {
						answer++;
						break;
					} else if(x == i) x++;
					else if (y == i) y--;
				}
				else if(arr[x] + arr[y] < val) x++;
				else y--;
			}
		}
		System.out.print(answer);
	} 
}
