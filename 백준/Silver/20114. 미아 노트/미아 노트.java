import java.io.*;
import java.util.StringTokenizer;

class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int H = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());
		
		String[] word = new String[H];
		for(int i = 0; i < H; i++)
			word[i] = br.readLine();
		
		char[] answer = new char[N];
		for(int i = 0; i < N; i++)
			answer[i] = '?';
		
		for(int i = 0; i < N*W; i++) {
			for(int j = 0; j < H; j++) {
				if(answer[i/W] != '?') continue;
				if(word[j].charAt(i) != '?')
					answer[i/W] = word[j].charAt(i);
			}
		}
		System.out.print(answer);
	}
}
