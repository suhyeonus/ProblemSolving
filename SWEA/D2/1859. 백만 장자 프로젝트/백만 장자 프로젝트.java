import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int N = sc.nextInt();
            int arr[] = new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = sc.nextInt();
            
            long answer = 0;
            int now_max = arr[N-1];
            for(int i = N-2; i >= 0; i--) {
				if(arr[i] > now_max)
                    now_max = arr[i];
                else answer += now_max - arr[i];
            }
            
            System.out.println("#" + test_case + " " + answer);
		}
	}
}