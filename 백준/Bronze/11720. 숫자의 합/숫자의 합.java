import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), answer = 0;
		String S = sc.next();

		for(int i = 0; i < N; i++)
			answer += S.charAt(i) - '0';
		
		System.out.print(answer);
		sc.close();
	} 
}
