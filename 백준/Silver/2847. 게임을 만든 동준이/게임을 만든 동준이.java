import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = 0;
        int[] scores = new int[N];
        
        for (int i = N-1; i >= 0; i--)
            scores[i] = Integer.parseInt(br.readLine());

        for (int i = 1; i < N; i++) 
            if (scores[i-1] - scores[i] <= 0) {
                answer += scores[i] - (scores[i-1] - 1);
                scores[i] = scores[i-1] - 1;
            }
        
        System.out.print(answer);
    }
}
