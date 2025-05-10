import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int[] dp = new int[x+1];
        dp[0] = 1;

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int L = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());

            for(int j = x; j >= 1; j--) {
                for(int l = 1; l <= C; l++) 
                    if(j == L*l) dp[j] += 1;
                    else if(j > L*l) dp[j] += dp[j - L*l];
            }
        }
        
        System.out.print(dp[x]);
    }
}
