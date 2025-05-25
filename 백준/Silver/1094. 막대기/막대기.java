import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int answer = 0;
		
		while(N > 0) {
			if(N%2 == 1) answer++;;
			N /= 2;
		}
			
		System.out.print(answer);
	}
}