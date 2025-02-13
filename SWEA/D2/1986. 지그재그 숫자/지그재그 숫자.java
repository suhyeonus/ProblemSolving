import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int N = sc.nextInt(), answer = 0;
            for(int i = 1; i <= N; i++)
                answer += i * (int)Math.pow(-1, i+1);
			
            System.out.printf("#%d %d%n", test_case, answer);
		}
	}
}