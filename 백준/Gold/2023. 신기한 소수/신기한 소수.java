import java.io.*;

public class Main {
	
	static int N;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		DFS(2, 1);
		DFS(3, 1);
		DFS(5, 1);
		DFS(7, 1);
	} 
	
	private static boolean isPrime(int x) {
		for(int i = 2; i <= x/2; i++)
			if(x%i == 0) return false;
		return true;
	}
	
	private static void DFS(int x, int len) {
		if(len == N) {
			if(isPrime(x)) 
				System.out.println(x);
			return;
		}
		
		for(int i = 1; i <= 9; i++) {
			if(i % 2 == 1 && isPrime(x*10 + i))
				DFS(x*10 + i, len+1);
		}
	}

}
