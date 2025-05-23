import java.io.*;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[145];
		arr[1] = 1;
		
		for(int i = 2; i <= 12; i++) {
			if(arr[i] == 1) continue;
			for(int j = i+i; j <= 144; j += i)
				arr[j] = 1;
		}
		
		ArrayList<Integer> prime = new ArrayList<Integer>();
		for(int i = 2; i <= 144; i++)
			if(arr[i] == 0) prime.add(i);
		
		for(int i = 0; i < prime.size() - 1; i++)
			if(prime.get(i) * prime.get(i+1) > N) {
				System.out.print(prime.get(i) * prime.get(i+1));
				break;
			}
	}
}
