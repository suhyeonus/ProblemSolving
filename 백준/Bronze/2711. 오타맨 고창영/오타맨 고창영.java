import java.io.*;
import java.util.StringTokenizer;

class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int tc = Integer.parseInt(br.readLine());
		while(tc-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			int n = Integer.parseInt(st.nextToken());
			String s = st.nextToken();
			
			for(int i = 0; i < s.length(); i++) 
				if(i != n-1)
					System.out.print(s.charAt(i));
			
			System.out.println();
		}
	}
}
