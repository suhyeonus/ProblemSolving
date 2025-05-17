import java.util.Scanner;
import java.io.FileInputStream;
import java.util.HashMap;

class Solution
{
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int tcnum = sc.nextInt();
        	int answer = 0;
            HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
            
            for(int i = 0; i < 1000; i++) {
            	int val = sc.nextInt();
                if(hash.containsKey(val)) {
                	hash.put(val, hash.get(val) + 1);
                } else hash.put(val, 0);
                
                if(!hash.containsKey(answer) || hash.get(val) > hash.get(answer))
                    answer = val;
                else if(hash.get(val) == hash.get(answer))
                    answer = Math.max(answer, val);
            }
            
            System.out.println("#" + tcnum + " " + answer);
		}
	}
}