import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int D = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int[] dp = new int[D+1];

        for(int i = 1; i <= P; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int L = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());

            for(int j = D; j >= 1; j--) 
                if (j == L) 
                    dp[j] = Math.max(C, dp[j]);
                else if (j >= L) 
                    dp[j] = Math.max(Math.min(dp[j-L], C), dp[j]);
        }
        
        System.out.print(dp[D]);
    }
}
