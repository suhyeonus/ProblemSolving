import java.io.*;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;

class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		int answer, x;
		
		while(true) {
			s = br.readLine();
			if(s.charAt(0) == '#') break;
			
			answer = 0; x = 0;
			for(int i = s.length()-1; i >= 0; i--) {
				int now = 0;
				
				switch(s.charAt(i)) {
				case '-':
					now = 0;
					break;
				case '\\':
					now = 1;
					break;
				case '(':
					now = 2;
					break;
				case '@':
					now = 3;
					break;
				case '?':
					now = 4;
					break;
				case '>':
					now = 5;
					break;
				case '&':
					now = 6;
					break;
				case '%':
					now = 7;
					break;
				case '/':
					now = -1;
					break;
				}
				
				answer += now * Math.pow(8, x);
				x++;
			}
			
			System.out.println(answer);
		}
		
	}
	
}