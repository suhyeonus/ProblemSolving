import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][2];
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int s[], int e[]) {
				if(s[1] == e[1]) return s[0]-e[0];
				return s[1]-e[1];
			}
		});
		
		int answer = 0;
		int nowEnd = 0;
		for(int[] n : arr) 
			if(n[0] >= nowEnd) {
				nowEnd = n[1];
				answer++;
			}
		
		System.out.print(answer);
	}
}
