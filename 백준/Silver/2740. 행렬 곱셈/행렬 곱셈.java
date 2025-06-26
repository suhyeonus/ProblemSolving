import java.io.*;
import java.util.StringTokenizer;

class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[][] mat1 = new int[N][M];
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < M; j++)
				mat1[i][j] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int[][] mat2 = new int[M][K];
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < K; j++)
				mat2[i][j] = Integer.parseInt(st.nextToken());
		}
		
		int[][] ansMat = new int[N][K];
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < K; j++) {
				for(int k = 0; k < M; k++) {
					ansMat[i][j] += mat1[i][k] * mat2[k][j];
				}
				System.out.print(ansMat[i][j] + " ");
			}
			System.out.println();
		}
	}
	
}