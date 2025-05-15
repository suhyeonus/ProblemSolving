import java.io.*;
import java.util.StringTokenizer;

public class Main {

	static int pwd_template[] = new int[4];
	static int pwd_now[] = new int[4];
	static int answer = 0, count = 0;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int S = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());

		char DNA[] = br.readLine().toCharArray();		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < 4; i++) {
			pwd_template[i] = Integer.parseInt(st.nextToken());
			if(pwd_template[i] == 0) count++;
		}
		
		// password init
		for(int i = 0; i < P; i++) 
			add(DNA[i]);
		
		if(count == 4) answer++;
		
		// sliding window
		for(int i = P; i < S; i++) {
			int j = i - P;
			add(DNA[i]);
			remove(DNA[j]);
			if(count == 4) answer++;
		}
		
		System.out.print(answer);
	} 
	
	private static void add(char c) {
		switch(c) {
		case 'A':
			pwd_now[0]++;
			if(pwd_now[0] == pwd_template[0])
				count++;
			break;
		case 'C':
			pwd_now[1]++;
			if(pwd_now[1] == pwd_template[1])
				count++;
			break;
		case 'G':
			pwd_now[2]++;
			if(pwd_now[2] == pwd_template[2])
				count++;
			break;
		case 'T':
			pwd_now[3]++;
			if(pwd_now[3] == pwd_template[3])
				count++;
			break;
		}
	}
	
	private static void remove(char c) {
		switch(c) {
		case 'A':
			if(pwd_now[0] == pwd_template[0])
				count--;
			pwd_now[0]--;
			break;
		case 'C':
			if(pwd_now[1] == pwd_template[1])
				count--;
			pwd_now[1]--;
			break;
		case 'G':
			if(pwd_now[2] == pwd_template[2])
				count--;
			pwd_now[2]--;
			break;
		case 'T':
			if(pwd_now[3] == pwd_template[3])
				count--;
			pwd_now[3]--;
			break;
		}
	}
}
