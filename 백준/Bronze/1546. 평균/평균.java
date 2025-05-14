import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] scores = new int[N];
		
		int maxVal = -1, sum = 0;
		for(int i = 0; i < N; i++) {
			scores[i] = sc.nextInt();
			maxVal = Math.max(maxVal, scores[i]);
			sum += scores[i];
		}
		
		System.out.print(sum * 100.0 / maxVal / N);
		sc.close();
	} 
}
