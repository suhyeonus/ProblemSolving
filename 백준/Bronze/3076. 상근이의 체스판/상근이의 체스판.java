import java.io.*;
import java.util.StringTokenizer;

class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int R, C, A, B;
		st = new StringTokenizer(br.readLine(), " ");
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine(), " ");
		A = Integer.parseInt(st.nextToken());
		B = Integer.parseInt(st.nextToken());
		
		for(int row = 0; row < R; row++) 
			for(int r = 0; r < A; r++) {
				for(int col = 0; col < C; col++) 
					for(int c = 0; c < B; c++) {
						if((row + col)%2 == 0)
							System.out.print('X');
						else System.out.print('.');
					}
				System.out.println();
			}
	}
}
