import java.io.*;
import java.util.StringTokenizer;

public class Main {
	
	private static long a, b;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		for(int tc = 0; tc < n; tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			a = Long.parseLong(st.nextToken());
			b = Long.parseLong(st.nextToken());
			
			System.out.println(a*2 <= b && b%a==0 ? 1 : 0);
		}
	}
	
	
}
