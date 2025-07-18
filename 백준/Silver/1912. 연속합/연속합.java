import java.io.*;
import java.util.*;

public class Main {

    static String s;
    static List<String> dict;
    static StringBuilder sb1, sb2, sb3, sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N];

        int val, answer = -10000;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < N; i++) {
            val = Integer.parseInt(st.nextToken());
            if(i == 0) dp[i] = val;
            else
                dp[i] = Math.max(dp[i-1] + val, val);

            answer = Math.max(dp[i], answer);
        }

        System.out.print(answer);
    }

}
