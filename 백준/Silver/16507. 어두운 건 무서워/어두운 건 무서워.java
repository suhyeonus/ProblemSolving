import java.io.*;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int q = Integer.parseInt(st.nextToken());
		
		int photo[][] = new int[r+1][c+1];
		for(int i = 1; i <= r; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 1; j <= c; j++)
				photo[i][j] += photo[i-1][j] + photo[i][j-1] - photo[i-1][j-1] + Integer.parseInt(st.nextToken());
		}
		
		while(q-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			int size = (y2-y1+1) * (x2-x1+1);
			int subset = photo[x2][y2] - photo[x1-1][y2] - photo[x2][y1-1] + photo[x1-1][y1-1];
			System.out.println((int)(subset/size));
		}
	} 
	
}
